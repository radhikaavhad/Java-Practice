package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static Connection connection;

    public static Connection getConnection() {
        return connection;
    }

    static{     //static init block
        try {
            Class.forName("org.h2.Driver");
            System.out.println("Driver Loaded.");

            connection  = DriverManager.
                    getConnection("jdbc:h2:file:C:\\Users\\Radhika Avhad\\Desktop\\h2","sa","");
            System.out.println("Established Connection.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }


}
