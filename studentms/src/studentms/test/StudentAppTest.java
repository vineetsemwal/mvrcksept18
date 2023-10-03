package studentms.test;

import studentms.model.CseStudent;
import studentms.model.EceStudent;
import studentms.model.Student;
import studentms.service.StudentService;

public class StudentAppTest {
    public static void main(String[] args) {
        StudentAppTest tester=new StudentAppTest();
        StudentService service=new StudentService();
        service.registerComputerScienceStudent("ajay","cse","java","dell");
        service.registerElectronicsStudent("rahul","ece","millimeter");
        Student students[] =service.getAll();
        tester.displayAll(students);

    }

    void displayAll(Student[] students){
        for (Student iteratedStudent:students){
            if(iteratedStudent==null){
                continue;
            }
            System.out.print(iteratedStudent.getId()+"-"+iteratedStudent.getCourse()+"-"+iteratedStudent.getName());
          //  boolean isCseStudent=iteratedStudent instanceof CseStudent;
            if(iteratedStudent instanceof CseStudent) {
                CseStudent cseStudent =(CseStudent) iteratedStudent;
                System.out.println(cseStudent.getLaptopAllotted()+"-"+cseStudent.getProgrammingLanguage());
            }
            if(iteratedStudent instanceof EceStudent){
                EceStudent eceStudent=(EceStudent) iteratedStudent;
                System.out.println(eceStudent.getDevice());
            }

        }
    }
}
