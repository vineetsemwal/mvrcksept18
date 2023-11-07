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

        Trainee ajay = addTrainee("ajay", "thinknxt","bangalore","awfis");
        Address ajayAddress=ajay.getAddress();
        int ajayAddressId=ajayAddress.getId();
        System.out.println("trainee created");
        displayTraineeWithAddress(ajay);
        Trainee archana = addTrainee("archana", "digital","chennai","anchorage");
        System.out.println("trainee created");
        displayTraineeWithAddress(archana);
        int id = ajay.getId();
        System.out.println("trainee to be fetched by id="+id);
        Trainee trainee = findTraineeById(id);
        displayTraineeWithAddress(trainee);

        System.out.println("address to be fetched");
        Address address=findAddressById(ajayAddressId);
        displayAddressWithTrainee(address);
        close();
    }

    void displayTraineeWithAddress(Trainee trainee) {
        System.out.println("trainee-" + trainee.getId() + "-" + trainee.getName() + "-" + trainee.getDepartment());
        Address address=trainee.getAddress();
        System.out.println("address="+address.getCity()+"-"+address.getBuilding());
    }

    void displayAddressWithTrainee(Address address){
        Trainee trainee=address.getTrainee();
        System.out.println("trainee-" + trainee.getId() + "-" + trainee.getName() + "-" + trainee.getDepartment());
        System.out.println("address="+address.getCity()+"-"+address.getBuilding());

    }
    Address findAddressById(int addrId){
       Address address= getEntityManager().find(Address.class,addrId);
       return address;
    }

    Trainee findTraineeById(int id) {
        Trainee trainee = getEntityManager().find(Trainee.class, id);
        return trainee;
    }

    Trainee addTrainee(String name, String dept, String city, String building) throws Exception {
        Address address=new Address(city,building);
        EntityTransaction transaction = getEntityManager().getTransaction();
        transaction.begin();
        getEntityManager().persist(address);
        Trainee trainee = new Trainee( name, dept,address);
        getEntityManager().persist(trainee);
        transaction.commit();
        address.setTrainee(trainee);
        return trainee;
    }

    void close() {
        getEntityManager().close();
    }

}
