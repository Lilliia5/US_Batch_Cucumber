package JDBC;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _03_BeforeAfter {
    Connection connection;
    Statement statement;
    @BeforeMethod
    public void DBConnection() throws SQLException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        // url contains name of the technology we use to connect with database(jdbc), type of the database(mysql), address of the server
        // of the database(//db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com), port number(3306) and name of the database

        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
         connection = DriverManager.getConnection(url, username, password); // Creates a connection with the databse

         statement = connection.createStatement();
    }


    @AfterMethod
    public void DBConnection() throws SQLException {
        connection.close();
    }
    @Test 
    public void test1(){

    }

}
