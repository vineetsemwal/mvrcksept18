package com.maveric.jpademo1;

import javax.persistence.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class JpaExperiment1 {
    private EntityManager entityManager;


    public EntityManager getEntityManager() {
        return entityManager;
    }

    public static void main(String[] args) throws Exception {
        JpaExperiment1 demo = new JpaExperiment1();
        demo.runApp();
    }

    void runApp() throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("trainingms");
        entityManager = emf.createEntityManager();

        Department digital=createDepartment("dig","digital","bangalore");
        System.out.println("created digital");
        display(digital);
        Department qe=createDepartment("qe","qe","chennai");
        String qeId=qe.getId();
        System.out.println("created qe");
        display(qe);
         String digitalId=digital.getId();
        Trainee ajay = addTrainee("ajay");
        int trainee1Id=ajay.getId();
        System.out.println("trainee created");
        display(ajay);
        Trainee archana = addTrainee("archana");
        int trainee2Id=archana.getId();
        System.out.println("trainee created");
        display(archana);
        //assigning departments to trainees
        System.out.println("***assigning departments to trainees");
        assignDepartment(digitalId,trainee1Id);
        assignDepartment(digitalId,trainee2Id );

        int id = ajay.getId();
        System.out.println("trainee to be fetched by id=" + id);
        Trainee trainee = findById(id);
        display(trainee);
        System.out.println("***** find department digital");
        Department foundDept=findDepartmentById("dig");
        display(foundDept);
        close();
    }

    void display(Trainee trainee) {
        System.out.println("trainee-" + trainee.getId() + "-" + trainee.getName() );
        Department department=trainee.getDepartment();
        if(department!=null) {
            display(department);
        }
    }
    void display(Department department){
        System.out.println(department.getId()+"-"+department.getName()+"-"+department.getLocation());
        Set<Trainee>trainees=department.getTrainees();
        if(trainees!=null){
            for (Trainee trainee:trainees){
                System.out.println("trainee-" + trainee.getId() + "-" + trainee.getName() );
            }
        }
    }

    Trainee findById(int id) {
        Trainee trainee = getEntityManager().find(Trainee.class, id);
        return trainee;
    }

    Department findDepartmentById(String id){
        return getEntityManager().find(Department.class,id);
    }

    Trainee addTrainee(String name) throws Exception {
        EntityTransaction transaction = getEntityManager().getTransaction();
        transaction.begin();
        Trainee trainee = new Trainee(name);
        getEntityManager().persist(trainee);
        transaction.commit();
        return trainee;
    }

    Department createDepartment(String deptId, String name, String location) {
        Department department = new Department(deptId, name, location);
        EntityTransaction transaction = getEntityManager().getTransaction();
        transaction.begin();
        getEntityManager().persist(department);
        transaction.commit();
        return department;
    }

    void assignDepartment(String deptId, Integer traineeId) {
        Department department = getEntityManager().find(Department.class, deptId);
        Trainee trainee = getEntityManager().find(Trainee.class, traineeId);
        EntityTransaction transaction = getEntityManager().getTransaction();
        transaction.begin();
        trainee.setDepartment(department);
        transaction.commit();

        Set<Trainee> trainees=department.getTrainees();
        if (trainees==null){
            trainees=new HashSet<>();
            department.setTrainees(trainees);
        }
        trainees.add(trainee);
    }

    void close() {
        getEntityManager().close();
    }

}
