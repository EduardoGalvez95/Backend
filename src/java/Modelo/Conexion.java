
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection con;
    public Conexion(){
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");  
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle"); 
        }catch(Exception e){
            
        }
    }
    public Connection getConnection(){
        return con;
    }
}
