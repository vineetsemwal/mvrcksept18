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

        Trainee ajay = addTrainee("ajay", "thinknxt");
        System.out.println("trainee created");
        display(ajay);
        Trainee archana = addTrainee("archana", "digital");
        System.out.println("trainee created");
        display(archana);
        int id = ajay.getId();
        System.out.println("trainee to be fetched by id=" + id);
        Trainee trainee = findById(id);
        display(trainee);
        System.out.println("***********fetching all trainees");
        List<Trainee>allTrainees=fetchAll();
        allTrainees.forEach(this::display);

        System.out.println("*****find by department");
        List<Trainee>digitalTrainees=findByDepartment("digital");
        digitalTrainees.forEach(this::display);

        close();

    }

    void display(Trainee trainee) {
        System.out.println("trainee-" + trainee.getId() + "-" + trainee.getName() + "-" + trainee.getDepartment());
    }


    public List<Trainee> fetchAll() throws SQLException {
        String qlText = "from Trainee";
        TypedQuery<Trainee> query = getEntityManager().createQuery(qlText, Trainee.class);
        List<Trainee>list=query.getResultList();
        return list;
    }

    public Trainee findByName(String name){
        String qlText="from Trainee where name=:param";
        TypedQuery<Trainee> query = getEntityManager().createQuery(qlText, Trainee.class);
        query.setParameter("param",name);
        Trainee trainee=query.getSingleResult();
        return trainee;
    }

    public List<Trainee> findByDepartment(String department){
        String qlText="from Trainee where department=:param";
        TypedQuery<Trainee> query = getEntityManager().createQuery(qlText, Trainee.class);
        query.setParameter("param",department);
        List<Trainee> trainee=query.getResultList();
        return trainee;
    }

    Trainee findById(int id) {
        Trainee trainee = getEntityManager().find(Trainee.class, id);
        return trainee;
    }

    Trainee addTrainee(String name, String dept) throws Exception {
        Trainee trainee = new Trainee(name, dept);
        EntityTransaction transaction = getEntityManager().getTransaction();
        transaction.begin();
        getEntityManager().persist(trainee);
        transaction.commit();
        return trainee;
    }

    void close() {
        getEntityManager().close();
    }

}
