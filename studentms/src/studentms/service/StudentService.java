package studentms.service;

import studentms.model.CseStudent;
import studentms.model.EceStudent;
import studentms.model.Student;

public class StudentService {
    private Student[] store = new Student[4];
    private int generatedId;

    private int generateId() {
        return ++generatedId;
    }

    private int locationIndex;


    private void add(Student student) {
        store[locationIndex] = student;
        ++locationIndex;
    }

    public void registerComputerScienceStudent(String name, String course, String language, String laptop) {
        int id = generateId();
        CseStudent student = new CseStudent(id, name, course, language, laptop);
        add(student);
    }

    public void registerElectronicsStudent(String name, String course,String device){
        int id = generateId();
        EceStudent student=new EceStudent(id,name,course,device);
        add(student);
    }

    public  Student[] getAll(){
        return store;
    }


}
