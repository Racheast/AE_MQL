package org.xtext.ui.editor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.xml.sax.SAXException;
import org.xtext.ui.util.DomainModelTransformer;
import org.xtext.ui.util.VQLLauncher;


public class MQLExecuterPage extends EditorPart {
	private XtextDocumentBasedEditorInput xtextEditorInput;
	private ListViewer listViewer;
	private Label titleLabel;
	private Text domainModelText;
	private Text matchesFoundText;
	private Collection<IPatternMatch> queryResult = new ArrayList<IPatternMatch>(); 
	private Button selectDomainModelButton, executeQueryButton;
	 
	@Override
	public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
		this.xtextEditorInput = (XtextDocumentBasedEditorInput) input;
		setSite(site);
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public void doSave(final IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	@Override
	public void createPartControl(final Composite parent) {
		Composite mainComposite = new Composite(parent, SWT.NONE);
		mainComposite.setLayout(new GridLayout(2, false));  

		titleLabel = new Label(mainComposite, SWT.NONE);
		titleLabel.setFont(JFaceResources.getBannerFont());
		titleLabel.setText("MQL Query Results");
		titleLabel.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).create());
		
		this.listViewer = new ListViewer(mainComposite, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		this.listViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).span(2, 1).create());
		this.listViewer.setContentProvider(new ArrayContentProvider());
		/*
		this.listViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(final Object element) {
				if (element instanceof SearchableElement) {
					SearchableElement searchableElement = (SearchableElement) element;
					return searchableElement.toString();
				}
				return super.getText(element);
			}
		});
		*/

		Composite selectionComposite = new Composite(mainComposite, SWT.NONE);
		selectionComposite.setLayout(new RowLayout());
		selectionComposite.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).create());
		
		Composite matchesCountComposite = new Composite(mainComposite, SWT.NONE);
		matchesCountComposite.setLayout(new RowLayout());
		matchesCountComposite.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).create());
		
		Label filepathLabel = new Label(selectionComposite, SWT.NONE);
		filepathLabel.setText("Selected domainmodel: ");
		
		domainModelText = new Text(selectionComposite, SWT.H_SCROLL | SWT.READ_ONLY);
		domainModelText.setText(" NO DOMAINMODEL SELECTED! PLEASE SELECT A DOMAINMODEL.");
		
		Label matchesCountLabel = new Label(matchesCountComposite, SWT.NONE);
		matchesCountLabel.setText("Matches found: ");
		
		matchesFoundText = new Text(matchesCountComposite, SWT.READ_ONLY);
		matchesFoundText.setText("");
		
		Composite buttonComposite = new Composite(mainComposite, SWT.PUSH);
		buttonComposite.setLayout(new FillLayout(SWT.VERTICAL));
		buttonComposite.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).create());
		
		selectDomainModelButton = new Button(buttonComposite, SWT.PUSH);
		selectDomainModelButton.setText("Select Domain Model");
		selectDomainModelButton.addListener(SWT.Selection, e -> selectDomainModel());
		
		executeQueryButton = new Button(buttonComposite, SWT.PUSH);
		executeQueryButton.setText("Execute Query");
		executeQueryButton.setEnabled(false);
		executeQueryButton.addListener(SWT.Selection, e -> executeQuery());
	}
	
	protected void executeQuery() {
		try {
			this.queryResult = VQLLauncher.executeQueries();
			refreshInput();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void selectDomainModel(){
		FileDialog dlg = new FileDialog(selectDomainModelButton.getShell(),  SWT.OPEN );
		dlg.setText("Open");
		dlg.setFilterExtensions(new String[]{"*.xmi"});
		String path = dlg.open();
		if (path == null) return;
		if(this.domainModelText != null) this.domainModelText.setText(path);
		//ATLLauncher.launch(path);  //commented out on 15.12.2018 due to ATL/EMTFVM problems in different versions of Eclipse IDEs
		try {
			DomainModelTransformer.launch(path);
			VQLLauncher.loadTransformedDomainModelResourceSet();
			executeQueryButton.setEnabled(true);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void refreshInput() {
		IXtextDocument doc = this.xtextEditorInput.getDocument();
		this.matchesFoundText.setText(queryResult.size() + "");
		this.listViewer.setInput(queryResult.toArray());
	}

	@Override
	public void setFocus() {
		this.listViewer.getControl().setFocus();
	}
}
