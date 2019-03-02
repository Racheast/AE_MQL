package modelBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import dmm.CourseType;
import dmm.impl.DmmPackageImpl;

public class ModelBuilder {
	
	private static EFactory dmmEFactory = DmmPackageImpl.init().getEFactoryInstance();

	private static int courseNumber = 10000000;
	private static int matriculationNumber = 1000000000;
	private static int employeeNumber = 1000000000;
	private static int examIdNr = 1000;
		
	private static HashMap<Integer, EObject> students = new HashMap<Integer, EObject>();
	private static HashMap<Integer, EObject> professors = new HashMap<Integer, EObject>();
	private static ArrayList<EObject> courses = new ArrayList<EObject>();
	private static ArrayList<EObject> allExams = new ArrayList<EObject>();
	
	private static ArrayList<String> firstNames = new ArrayList<String>();
	private static ArrayList<String> lastNames = new ArrayList<String>();
	private static ArrayList<String> emailDomains = new ArrayList<String>();
	private static ArrayList<String> courseNames = new ArrayList<String>();
	
	
	
	public static void main(String[] args) {
		generateModel();
	}
	
	private static void generateModel() {
		EObject universityManagementSystem = dmmEFactory.create(DmmPackageImpl.init().getUniversityManagementSystem());

		init_random_Names();
		initCourseNames();
		init_random_EmailDomains();

		init_random_Students(320);  //2000 
		init_random_Professors(320);  //2000
		initCourses(9); //20 predefined courses! Parameter is the multiplicationFactor

		assignPersonsAndCoursesToRoot(universityManagementSystem);
		assignStudentsToCourses();
		assignProfessorsToCourses();
		// assignMandatoryForCourses(); //warning: can cause cyclic references

		serialize(universityManagementSystem);
	}

	private static void serialize(EObject root) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		
		String sizeAll = "All" + (students.size() + professors.size() + courses.size() + allExams.size());
		String sizeSeparate = "S" + students.size() + "_P" + professors.size() + "_C" + courses.size() + "_E" + allExams.size();
		
		
		XMIResource resource = (XMIResource) resourceSet.createResource(URI.createURI("./University_Random_" + sizeSeparate + "_" + sizeAll + ".xmi"));
		;
		resource.setEncoding("UTF-8");
		resource.getContents().add(root);

		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void assignPersonsAndCoursesToRoot(EObject universityManagementSystem) {
		Collection<EObject> persons = new ArrayList<EObject>();

		persons.addAll(students.values());
		persons.addAll(professors.values());

		universityManagementSystem.eSet(universityManagementSystem.eClass().getEStructuralFeature("person"), persons);
		universityManagementSystem.eSet(universityManagementSystem.eClass().getEStructuralFeature("course"), courses);
	}

	private static void assignStudentsToCourses() {
		for (EObject s : students.values()) {
			int nrAttends = getRandomNumberInRange(1, 15);
			HashSet<EObject> attendsSet = new HashSet<EObject>();
			for (int i = 0; i < nrAttends; i++)
				attendsSet.add(courses.get(getRandomNumberInRange(0, courses.size() - 1)));

			s.eSet(s.eClass().getEStructuralFeature("attends"), attendsSet);
		}
	}

	private static void assignProfessorsToCourses() {
		for (EObject p : professors.values()) {
			int nrAttends = getRandomNumberInRange(1, 15);
			HashSet<EObject> lecturesSet = new HashSet<EObject>();
			for (int i = 0; i < nrAttends; i++)
				lecturesSet.add(courses.get(getRandomNumberInRange(0, courses.size() - 1)));

			p.eSet(p.eClass().getEStructuralFeature("lectures"), lecturesSet);
		}
	}

	private static void assignMandatoryForCourses() {
		for (EObject course : courses) {
			int nrMandatoryFor = getRandomNumberInRange(0, 4);
			for (int i = 0; i < nrMandatoryFor; i++) {
				EObject c = courses.get(getRandomNumberInRange(0, courses.size() - 1));
				Collection<EObject> mandatoryFor = (Collection<EObject>) course
						.eGet(course.eClass().getEStructuralFeature("mandatoryFor"));
				mandatoryFor.add(c);
				Collection<EObject> temp = new ArrayList<EObject>();
				temp.addAll(mandatoryFor);
				course.eSet(course.eClass().getEStructuralFeature("mandatoryFor"), temp);
			}
		}
	}

	private static void init_random_Students(int number) {
		for (int i = 0; i < number; i++) {
			int mNr = matriculationNumber;
			matriculationNumber = matriculationNumber + 10;
			String firstName = firstNames.get(getRandomNumberInRange(0, 30));
			String lastName = lastNames.get(getRandomNumberInRange(0, 30));
			String name = firstName + " " + lastName;
			Collection<String> emails = generateEMails(firstName, lastName);
			students.put(mNr, createStudent(name, emails, mNr));
		}
	}

	private static Collection<String> generateEMails(String firstName, String lastName) {
		ArrayList<String> emails = new ArrayList<String>();
		int nrEmails = getRandomNumberInRange(0, 5);
		for (int i = 0; i < nrEmails; i++)
			emails.add(firstName + "." + lastName + getRandomNumberInRange(1, 999999) + "@"
					+ emailDomains.get(getRandomNumberInRange(0, 9)));

		return emails;
	}

	private static void init_random_Professors(int number) {
		for (int i = 0; i < number; i++) {
			int eNr = employeeNumber;
			employeeNumber = employeeNumber + 10;
			String firstName = firstNames.get(getRandomNumberInRange(0, 30));
			String lastName = lastNames.get(getRandomNumberInRange(0, 30));
			String name = firstName + " " + lastName;
			Collection<String> emails = generateEMails(firstName, lastName);
			professors.put(eNr, createProfessor(name, emails, eNr));
		}
	}

	private static void initCourses(int multiplicationFactor) {
		for (int i = 0; i < courseNames.size(); i++) {
			for(int j = 0; j<multiplicationFactor; j++){
				String courseName = courseNames.get(i) + "_v" + j;
				dmm.CourseType courseType = getRandomCourseType();
	
				int courseCounter = getRandomNumberInRange(1, 2);
	
				ArrayList<EObject> coursesWithSameName = new ArrayList<EObject>();
	
				for (int k = 0; k < courseCounter; k++) {
					int cNr = courseNumber;
					courseNumber = courseNumber + 10;
					EObject course = createCourse(courseName + (k + 1), cNr, courseType);
	
					int examCounter=getRandomNumberInRange(0, 1);
					
					Collection<EObject> exams = new ArrayList<EObject>();
					for (int l = 0; l < examCounter; l++) {
						String eId = courseName + (k + 1) + "_" + examIdNr;
						examIdNr++;
						exams.add(createExam(eId));
					}
					course.eSet(course.eClass().getEStructuralFeature("exam"), exams);
					coursesWithSameName.add(course);
					courses.add(course);
					allExams.addAll(exams);
				}
	
				for (int k = 0; k < coursesWithSameName.size(); k++) {
					EObject c = coursesWithSameName.get(k);
					if (k < coursesWithSameName.size() - 1) {
						Collection<EObject> mandatoryFor = new ArrayList<EObject>();
						mandatoryFor.add(coursesWithSameName.get(k + 1));
						c.eSet(c.eClass().getEStructuralFeature("mandatoryFor"), mandatoryFor);
					}
				}
			}
		}
	}

	private static dmm.CourseType getRandomCourseType() {
		dmm.CourseType courseType = null;
		int r = getRandomNumberInRange(1, 4);
		switch (r) {
		case 1:
			courseType = CourseType.VO;
			break;
		case 2:
			courseType = CourseType.UE;
			break;
		case 3:
			courseType = CourseType.SEM;
			break;
		case 4:
			courseType = CourseType.PR;
			break;
		}
		return courseType;
	}

	private static EObject createStudent(String name, Collection<String> emails, int matriculationNumber) {
		EClass studentEClass = DmmPackageImpl.init().getStudent();
		EObject student = dmmEFactory.create(studentEClass);
		student.eSet(studentEClass.getEStructuralFeature("name"), name);
		student.eSet(studentEClass.getEStructuralFeature("email"), emails);
		student.eSet(studentEClass.getEStructuralFeature("matriculationNumber"), matriculationNumber);
		return student;
	}

	private static EObject createProfessor(String name, Collection<String> emails, int employeeNumber) {
		EClass professorEClass = DmmPackageImpl.init().getProfessor();
		EObject professor = dmmEFactory.create(professorEClass);
		professor.eSet(professorEClass.getEStructuralFeature("name"), name);
		professor.eSet(professorEClass.getEStructuralFeature("email"), emails);
		professor.eSet(professorEClass.getEStructuralFeature("employeeNumber"), employeeNumber);
		return professor;
	}

	private static EObject createCourse(String name, int courseNumber, dmm.CourseType courseType) {
		EClass courseEClass = DmmPackageImpl.init().getCourse();
		EObject course = dmmEFactory.create(courseEClass);
		course.eSet(courseEClass.getEStructuralFeature("name"), name);
		course.eSet(courseEClass.getEStructuralFeature("courseNumber"), courseNumber);
		course.eSet(courseEClass.getEStructuralFeature("courseType"), courseType);
		return course;
	}

	private static EObject createExam(String examID) {
		EClass examEClass = DmmPackageImpl.init().getExam();
		EObject exam = dmmEFactory.create(examEClass);
		exam.eSet(examEClass.getEStructuralFeature("examID"), examID);
		return exam;
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	private static void initCourseNames() {
		courseNames.add("Geography");
		courseNames.add("Biology");
		courseNames.add("Ethics in Computing");
		courseNames.add("Technical Computing");
		courseNames.add("Technical Japanese");
		courseNames.add("Technical English");
		courseNames.add("Technical Italian");
		courseNames.add("Technical Spanish");
		courseNames.add("Accounting");
		courseNames.add("Applied Statistics");
		courseNames.add("Micro Economics");
		courseNames.add("Macro Economics");
		courseNames.add("Organisation");
		courseNames.add("Process Management");
		courseNames.add("Seminar for Bachelors");
		courseNames.add("Theoretical Computing");
		courseNames.add("Model Engineering");
		courseNames.add("Modeling and Simulation");
		courseNames.add("Soft skills");
		courseNames.add("Hard skills");
	}

	private static void init_random_Names() {
		firstNames.add("Anton");
		firstNames.add("Andreas");
		firstNames.add("Alexander");
		firstNames.add("Alfred");
		firstNames.add("Arnold");
		firstNames.add("Anastasia");
		firstNames.add("Alena");
		firstNames.add("Ariel");
		firstNames.add("Adriana");
		firstNames.add("Anna");
		firstNames.add("Benedikt");
		firstNames.add("Bryan");
		firstNames.add("Bistro");
		firstNames.add("Bastian");
		firstNames.add("Bella");
		firstNames.add("Barbara");
		firstNames.add("Birgit");
		firstNames.add("Brigitte");
		firstNames.add("Bianca");
		firstNames.add("Bettina");
		firstNames.add("Beate");
		firstNames.add("Christoph");
		firstNames.add("Christian");
		firstNames.add("Carl");
		firstNames.add("Carlo");
		firstNames.add("Christine");
		firstNames.add("Christina");
		firstNames.add("Clara");
		firstNames.add("Claudia");
		firstNames.add("Carina");
		firstNames.add("Cornelia");

		lastNames.add("Albrecht");
		lastNames.add("Altmann");
		lastNames.add("Anthony");
		lastNames.add("Müllberger");
		lastNames.add("Meier");
		lastNames.add("Marindo");
		lastNames.add("Marindova");
		lastNames.add("Dosenbier");
		lastNames.add("Danzig");
		lastNames.add("Freeman");
		lastNames.add("Bryant");
		lastNames.add("Hartlinger");
		lastNames.add("Klein");
		lastNames.add("Gross");
		lastNames.add("Grossmann");
		lastNames.add("Grossfrau");
		lastNames.add("Stone");
		lastNames.add("Stein");
		lastNames.add("Baum");
		lastNames.add("Baumgarten");
		lastNames.add("Apfel");
		lastNames.add("Trauma");
		lastNames.add("Wissen");
		lastNames.add("Buchlink");
		lastNames.add("Deutscher");
		lastNames.add("Slava");
		lastNames.add("Svoboda");
		lastNames.add("Korn");
		lastNames.add("Tanne");
		lastNames.add("West");
		lastNames.add("Lichtfeld");
	}

	private static void init_random_EmailDomains() {
		emailDomains.add("yahoo.de");
		emailDomains.add("hotmail.de");
		emailDomains.add("geemail.to");
		emailDomains.add("chello.at");
		emailDomains.add("gmx.at");
		emailDomains.add("web.de");
		emailDomains.add("student.myuniversity.at");
		emailDomains.add("myuni.at");
		emailDomains.add("fastmail.to");
		emailDomains.add("slowmail.com");
	}

}
