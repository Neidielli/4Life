// situa em qual package ou "pacote" está a classe 
package factory; 
// faz as importações de classes necessárias para o funcionamento do programa 
import java.sql.Connection; 
// conexão SQL para Java 
import java.sql.DriverManager; 
// driver de conexão SQL para Java 
import java.sql.SQLException; 
// classe para tratamento de exceções 
public class ConnectionFactory {
     public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://localhost/projetojava","root","Jackson23+-");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
     }
        
}
//public class ConnectionFactory {
//
//    private static String enviroment = "dev";
//    
//    private static Connection connection = null;
//
//    private static String url;
//    private static String username;
//    private static String password;
//    
//    public ConnectionFactory(String enviroment){
//        this.enviroment = enviroment;
//    }
//    
//    public Connection openConnection() {
//        loadDataForConnection();
//        
//        try {
//            connection = DriverManager.getConnection(url, username, password);
//            connection.setAutoCommit(true);
//            
//            return connection;
//        } catch (SQLException ex) {
//            throw new RuntimeException("Erro na conexÃ£o: ", ex);
//        }
//    }
//    
//    public void closeConnection(Connection con){       
//           try {
//                if(con!=null){
//                    con.close();
//                }
//           } catch (SQLException ex) {
//               Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//           }       
//   }
//   
//   public void closeConnection(Connection con, PreparedStatement stmt){       
//       closeConnection(con);
//           try {
//                if(stmt!=null){
//                    stmt.close();
//                }
//           } catch (SQLException ex) {
//               Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//           }       
//   }
//   
//   public void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){       
//       closeConnection(con, stmt);
//           try {
//                if(rs!=null){
//                    rs.close();
//                }
//           } catch (SQLException ex) {
//               Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//           }       
//   }
//
//    public void loadDataForConnection() {
//        String path = System.getProperty("user.dir");
//        File config_file = new File("");
//        if(this.enviroment == "dev"){
//            config_file = new File(path + "/src/main/resources/application.properties");
//        }else if(this.enviroment == "test"){
//            config_file = new File(path + "/src/main/resources/application_test.properties");
//        }
//
//        Properties props = new Properties();
//        try {
//            FileInputStream in = new FileInputStream(config_file);
//            props.load(in);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        String driver = props.getProperty("jdbc.driver");
//        url = props.getProperty("jdbc.url");
//        username = props.getProperty("jdbc.username");
//
//        if (username == null) {
//            username = "";
//        }
//        password = props.getProperty("jdbc.password");
//        if (password == null) {
//            password = "";
//        }
//        if (driver != null) {
//            try {
//                Class.forName(driver);
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//    
//     public void loadDataForConnectionTest() {
//        String path = System.getProperty("user.dir");
//... (32 linhas)
//Recolher
//message.txt
//5 KB
//﻿
//public class ConnectionFactory {
//
//    private static String enviroment = "dev";
//    
//    private static Connection connection = null;
//
//    private static String url;
//    private static String username;
//    private static String password;
//    
//    public ConnectionFactory(String enviroment){
//        this.enviroment = enviroment;
//    }
//    
//    public Connection openConnection() {
//        loadDataForConnection();
//        
//        try {
//            connection = DriverManager.getConnection(url, username, password);
//            connection.setAutoCommit(true);
//            
//            return connection;
//        } catch (SQLException ex) {
//            throw new RuntimeException("Erro na conexÃ£o: ", ex);
//        }
//    }
//    
//    public void closeConnection(Connection con){       
//           try {
//                if(con!=null){
//                    con.close();
//                }
//           } catch (SQLException ex) {
//               Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//           }       
//   }
//   
//   public void closeConnection(Connection con, PreparedStatement stmt){       
//       closeConnection(con);
//           try {
//                if(stmt!=null){
//                    stmt.close();
//                }
//           } catch (SQLException ex) {
//               Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//           }       
//   }
//   
//   public void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){       
//       closeConnection(con, stmt);
//           try {
//                if(rs!=null){
//                    rs.close();
//                }
//           } catch (SQLException ex) {
//               Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//           }       
//   }
//
//    public void loadDataForConnection() {
//        String path = System.getProperty("user.dir");
//        File config_file = new File("");
//        if(this.enviroment == "dev"){
//            config_file = new File(path + "/src/main/resources/application.properties");
//        }else if(this.enviroment == "test"){
//            config_file = new File(path + "/src/main/resources/application_test.properties");
//        }
//
//        Properties props = new Properties();
//        try {
//            FileInputStream in = new FileInputStream(config_file);
//            props.load(in);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        String driver = props.getProperty("jdbc.driver");
//        url = props.getProperty("jdbc.url");
//        username = props.getProperty("jdbc.username");
//
//        if (username == null) {
//            username = "";
//        }
//        password = props.getProperty("jdbc.password");
//        if (password == null) {
//            password = "";
//        }
//        if (driver != null) {
//            try {
//                Class.forName(driver);
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//    
//     public void loadDataForConnectionTest() {
//        String path = System.getProperty("user.dir");
//        File config_file = new File(path + "/src/main/resources/application-test.properties");
//
//        Properties props = new Properties();
//        try {
//            FileInputStream in = new FileInputStream(config_file);
//            props.load(in);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        String driver = props.getProperty("jdbc.driver");
//        url = props.getProperty("jdbc.url");
//        username = props.getProperty("jdbc.username");
//
//        if (username == null) {
//            username = "";
//        }
//        password = props.getProperty("jdbc.password");
//        if (password == null) {
//            password = "";
//        }
//        if (driver != null) {
//            try {
//                Class.forName(driver);
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//}
//message.txt
//5 KB
