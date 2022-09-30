package factory;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/projetojava", "root", "UTF2022t7Usa");
        } 
        catch (SQLException exc) {
            throw new RuntimeException(exc);
        }
    }
    /*
    public static void closeConnection(Connection connection){
        
        try {
            if(connection != null){
                connection.close();
            }
        } 
        catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void closeConnection(Connection connection, PreparedStatement pdstmt) {
        
        closeConnection(connection);
        try {
            if(pdstmt != null){
                pdstmt.close();
            }
        } 
        catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void closeConnection(Connection connection, PreparedStatement pdstmt, ResultSet rs) {
        
        closeConnection(connection, pdstmt);
        
        try {
            if(rs != null){
                rs.close();
            }
        } 
        catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
}
