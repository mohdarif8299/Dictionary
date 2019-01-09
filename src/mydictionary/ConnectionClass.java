/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mohd Arif
 */
public class ConnectionClass {
    static Connection connection;
      public static Connection getDatabaseConnection() {
          try {
              connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DICTIONARY","root","Ma9891228493");
          }
          catch(Exception e) {
              e.printStackTrace();
          }
          return connection;
      }
}
