package studentms.test;

import studentms.model.CseStudent;
import studentms.model.EceStudent;
import studentms.model.Student;
import studentms.service.StudentService;

public class StudentAppTest {
    public static void main(String[] args) {
        StudentAppTest tester = new StudentAppTest();
        StudentService service = new StudentService();
        service.registerComputerScienceStudent("ajay", "cse", "java", "dell");
        service.registerElectronicsStudent("rahul", "ece", "millimeter");
        Student students[] = service.getAll();
        tester.displayAll(students);

    }

    void display(CseStudent student) {
        System.out.print(student.getId() + "-" + student.getCourse() + "-" + student.getName());
        System.out.println(student.getLaptopAllotted() + "-" + student.getProgrammingLanguage());

    }
    void display(EceStudent student) {
        System.out.print(student.getId() + "-" + student.getCourse() + "-" + student.getName());
        System.out.println(student.getDevice());

    }

    void displayAll(Student[] students) {
        for (Student iteratedStudent:students) {
            if (iteratedStudent == null) {
                continue;
            }
            if(iteratedStudent instanceof CseStudent) {
                CseStudent cseStudent=(CseStudent)iteratedStudent;
                display(cseStudent);
            }
            if(iteratedStudent instanceof EceStudent) {
                EceStudent eceStudent=(EceStudent)iteratedStudent;
                display(eceStudent);
            }
        }
    }
}
