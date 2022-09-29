package factory;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/projetojava", "root", "Jackson23+-");
        } 
        catch (SQLException exc) {
            throw new RuntimeException(exc);
        }
    }
}
