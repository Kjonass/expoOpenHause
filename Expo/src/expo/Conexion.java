package expo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conectar(){
        try{
            
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/aerolineaj", "root","");
            return conexion;
            
        }catch(SQLException e){
            System.out.println("Error en la conexión "+e.toString());
        }
        return(null);
    }
}
