package com.maveric.jdbcdemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*

way of working in jdbc
        1) Register Driver
        2) Create database connection
         3) create statement
         4) execute query (CRUD)
         */
public class JdbcExperiment2 {


    private List<Trainee> list = new ArrayList<>();
    final String url = "jdbc:mysql://localhost:3306/trainingdb";
    final String username = "root", password = "scooby";
    private Connection con;


    public Connection getConnection() throws SQLException {
        if (con != null) {
            return con;
        }
        con = DriverManager.getConnection(url, username, password);
        return con;
    }

    public static void main(String[] args) throws Exception {
        JdbcExperiment2 demo = new JdbcExperiment2();
        demo.runApp();
    }

    void runApp() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        addTrainee(6,"ajay","thinknxt");
        List<Trainee>list=fetchAll();
        for (Trainee trainee:list){
            display(trainee);
        }
        closeConnection();
    }

    void display(Trainee trainee){
        System.out.println("trainee-"+trainee.getId()+"-"+trainee.getName()+"-"+trainee.getDepartment());
    }

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

    PreparedStatement getPreparedStatementForFetchAll() throws SQLException {
        String sql = "select * from trainees";
        final PreparedStatement statement = getConnection().prepareStatement(sql);
        return statement;
    }

    PreparedStatement getPreparedStatementForAdd() throws SQLException {
        String sql = "insert into trainees(id,name, dept) values(? ,? , ?)";
        final PreparedStatement statement = getConnection().prepareStatement(sql);
        return statement;
    }

    void addTrainee(int id, String name, String dept) throws Exception {
        final PreparedStatement statement = getPreparedStatementForAdd();
        statement.setInt(1, id);
        statement.setString(2, name);
        statement.setString(3, dept);
        int rowsAffected = statement.executeUpdate();
    }

    void closeConnection() throws SQLException {
        con.close();
        con = null;
    }

}
