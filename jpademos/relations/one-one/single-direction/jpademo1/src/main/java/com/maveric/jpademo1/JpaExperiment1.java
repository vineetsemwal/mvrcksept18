package com.maveric.jpademo1;

import javax.persistence.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


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

        Trainee ajay = addTrainee("ajay", "thinknxt","bangalore","awfis");
        System.out.println("trainee created");
        display(ajay);
        Trainee archana = addTrainee("archana", "digital","chennai","anchorage");
        System.out.println("trainee created");
        display(archana);
        int id = ajay.getId();
        System.out.println("trainee to be fetched by id="+id);
        Trainee trainee = findById(id);
        display(trainee);
        close();
    }

    void display(Trainee trainee) {
        System.out.println("trainee-" + trainee.getId() + "-" + trainee.getName() + "-" + trainee.getDepartment());
        Address address=trainee.getAddress();
        System.out.println("address="+address.getCity()+"-"+address.getBuilding());
    }

    Trainee findById(int id) {
        Trainee trainee = getEntityManager().find(Trainee.class, id);
        return trainee;
    }

    Trainee addTrainee(String name, String dept, String city, String building) throws Exception {
        Address address=new Address(city,building);
        EntityTransaction transaction = getEntityManager().getTransaction();
        transaction.begin();
        Trainee trainee = new Trainee( name, dept,address);
        getEntityManager().persist(trainee);
        transaction.commit();
        return trainee;
    }

    void close() {
        getEntityManager().close();
    }

}
