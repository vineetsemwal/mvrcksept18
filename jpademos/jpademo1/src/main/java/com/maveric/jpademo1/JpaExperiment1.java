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
        System.out.println("trainee to be fetched by id="+id);
        Trainee trainee = findById(id);
        display(trainee);
        close();
    }

    void display(Trainee trainee) {
        System.out.println("trainee-" + trainee.getId() + "-" + trainee.getName() + "-" + trainee.getDepartment());
    }

    /*
        public List<Trainee> fetchAll() throws SQLException {
            PreparedStatement statement = getPreparedStatementForFetchAll();
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String traineeName = resultSet.getString("name");
                String department = resultSet.getString("dept");
                int id = resultSet.getInt("id");
                Trainee trainee = new Trainee(id, traineeName, department);
                list.add(trainee);
            }
            return list;
        }
    */
    Trainee findById(int id) {
        Trainee trainee = getEntityManager().find(Trainee.class, id);
        return trainee;
    }

    Trainee addTrainee(String name, String dept) throws Exception {
        Trainee trainee = new Trainee( name, dept);
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
