package prueba1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexion {
	private String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String url="jdbc:sqlserver://localhost:1433;databaseName=dbfastnet";
    private String user="fastnet";
    private String pass="fn4321";
    public Conexion(){    
    }  
    public Connection conectar(){      
        try {   
        	Class.forName(driver);
            return(DriverManager.getConnection(url, user, pass));
        } catch (Exception e) {
           e.printStackTrace();
        }
        return null;
    }  
    public void CerrarConexion(Connection con){
        try {
            con.close();
        } catch (Exception e) {
        }
    }
    
}