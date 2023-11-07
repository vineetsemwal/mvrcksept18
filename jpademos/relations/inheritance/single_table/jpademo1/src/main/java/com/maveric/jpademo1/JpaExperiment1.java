package com.maveric.jpademo1;

import javax.persistence.*;


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

        DevelopmentTrainee ajay = addDeveloper("ajay", "thinknxt","bangalore","awfis","java");
        System.out.println("trainee created");
        display(ajay);
        QETrainee archana = addQE("archana", "digital","chennai","anchorage","selenium");
        System.out.println("trainee created");
        display(archana);
        int id = ajay.getId();
        System.out.println("development trainee to be fetched by id="+id);
        DevelopmentTrainee trainee = findDeveloperById(id);
        display(trainee);
        close();
    }

    void  display(QETrainee trainee){
        displayTrainee(trainee);
        System.out.println("tool="+trainee.getTool());
    }

    void  display(DevelopmentTrainee trainee){
        displayTrainee(trainee);
        System.out.println("language="+trainee.getLanguage());
    }

    void displayTrainee(Trainee trainee) {
        System.out.println("trainee-" + trainee.getId() + "-" + trainee.getName() + "-" + trainee.getDepartment());
        Address address=trainee.getAddress();
        System.out.println("address="+address.getCity()+"-"+address.getBuilding());
    }

    DevelopmentTrainee findDeveloperById(int id) {
        DevelopmentTrainee trainee = getEntityManager().find(DevelopmentTrainee.class, id);
        return trainee;
    }

   QETrainee findQETraineeById(int id) {
        QETrainee trainee = getEntityManager().find(QETrainee.class, id);
        return trainee;
    }
    DevelopmentTrainee addDeveloper(String name, String dept, String city, String building,String language) throws Exception {
        Address address=new Address(city,building);
        EntityTransaction transaction = getEntityManager().getTransaction();
        transaction.begin();
        DevelopmentTrainee trainee = new DevelopmentTrainee( name, dept,address,language);
        getEntityManager().persist(trainee);
        transaction.commit();
        return trainee;
    }


    QETrainee addQE(String name, String dept, String city, String building,String tool) throws Exception {
        Address address=new Address(city,building);
        EntityTransaction transaction = getEntityManager().getTransaction();
        transaction.begin();
        QETrainee trainee = new QETrainee( name, dept,address,tool);
        getEntityManager().persist(trainee);
        transaction.commit();
        return trainee;
    }

    void close() {
        getEntityManager().close();
    }

}
