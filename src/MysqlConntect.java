/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author bendz
 */
public class MysqlConntect {
    
    Connection conn = null;
    
    public static Connection ConnectDB() {
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver"); //loading driver
                  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","");
            //JOptionPane.showMessageDialog(null, "Connection Successful");
            
            return conn;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
