package com.maveric.jpademo1;

import javax.persistence.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


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

        Department digital = createDepartment("dig", "digital", "bangalore");
        System.out.println("created digital");
        display(digital);
        Department qe = createDepartment("qe", "qe", "chennai");
        String qeId = qe.getId();
        System.out.println("created qe");
        display(qe);
        String digitalId = digital.getId();
        Trainee ajay = addTrainee("ajay");
        int trainee1Id = ajay.getId();
        System.out.println("trainee created");
        display(ajay);
        Trainee archana = addTrainee("archana");
        int trainee2Id = archana.getId();
        System.out.println("trainee created");
        display(archana);
        //assigning departments to trainees
        System.out.println("***assigning departments to trainees");
        assignDepartment(digitalId, trainee1Id);
        assignDepartment(digitalId, trainee2Id);

        int id = ajay.getId();
        System.out.println("trainee to be fetched by id=" + id);
        Trainee trainee = findById(id);
        display(trainee);
        System.out.println("*****fetching trainees by department digital");
        List<Trainee> list = findTraineesByDepartment("digital");
        list.forEach(this::display);
        close();
    }

    List<Trainee> findTraineesByDepartment(String department) {
        String qlText = "select trainee from Trainee trainee join trainee.department dept where dept.name=:deptParam";
        TypedQuery<Trainee> query = getEntityManager().createQuery(qlText,Trainee.class);
        query.setParameter("deptParam", department);
        List<Trainee> list = query.getResultList();
        return list;
    }

    void display(Trainee trainee) {
        System.out.println("trainee-" + trainee.getId() + "-" + trainee.getName());
        Department department = trainee.getDepartment();
        if (department != null) {
            display(department);
        }
    }

    void display(Department department) {
        System.out.println(department.getId() + "-" + department.getName() + "-" + department.getLocation());
    }

    Trainee findById(int id) {
        Trainee trainee = getEntityManager().find(Trainee.class, id);
        return trainee;
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
    }

    void close() {
        getEntityManager().close();
    }

}
