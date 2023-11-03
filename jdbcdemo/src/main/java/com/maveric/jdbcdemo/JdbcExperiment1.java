package com.maveric.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*

way of working in jdbc
        1) Register Driver
        2) Create database connection
         3) create statement
         4) execute query (CRUD)
         */
public class JdbcExperiment1 {

    private List<Trainee>list=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        JdbcExperiment1 demo=new JdbcExperiment1();
        demo.runApp();
    }

    void runApp() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        final String url = "jdbc:mysql://localhost:3306/trainingdb";
        final String username = "root", password = "scooby";
        final Connection connection = DriverManager.getConnection(url, username, password);
        final Statement statement= connection.createStatement();
        String insertSql="insert into trainees(id,name, dept) values(4 ,'archana' , 'thinknxt');";
        int rowsAffected=statement.executeUpdate(insertSql);
        System.out.println("rows affected="+rowsAffected);
        String fetchAllSql="select * from trainees";
        ResultSet resultSet =statement.executeQuery(fetchAllSql);
        while (resultSet.next()){
          String traineeName=  resultSet.getString("name");
          String department=resultSet.getString("dept");
          int id=resultSet.getInt("id");
            System.out.println("fetched Data ="+id+"-"+traineeName+"-"+department);
          Trainee trainee=new Trainee(id,traineeName,department);
          list.add(trainee);
        }

    }

}
