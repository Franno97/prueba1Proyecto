package prueba1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;


//import com.fastnet.datos.Conexion;
//import com.fastnet.datos.Usuario;

public class Usuarios {
	public List ObtenerUsuarios() {
		List<Usuario> listaContactos=new LinkedList<Usuario>();
	      try
	      {
	         Conexion conn = new Conexion();
	    	 Connection con = conn.conectar();
	         Statement st = con.createStatement();
	         ResultSet rs = st.executeQuery("select * from usuario" );
	         while (rs.next())
	         {
	            Usuario contacto = new Usuario();
	            contacto.setNickname(rs.getString("nickname"));
	            contacto.setID(rs.getString("ID"));
	            contacto.setNombre(rs.getString("nombre"));
	            contacto.setPassword(rs.getString("password"));
	            contacto.setEmail(rs.getString("email"));  
	            listaContactos.add(contacto);
	         }
	         rs.close();
	         st.close();
	         con.close(); 
	      }
	      catch (Exception e)
	      {
	         e.printStackTrace();
	      }
	     return listaContactos;
	  }
	public void insertarUsuario(String nickname, String ID, String nombre, String password, String email) {
		
		try {
			Conexion conn = new Conexion();
	   	 	Connection con = conn.conectar();
	        Statement st = con.createStatement();
	        st.execute("insert into usuario values('" + nickname + "','" 
	        		+ ID + "','" + nombre + "','" + password + "','" + email + "')");
	        st.close();
	        con.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void modificarUsuario(String columna, String valor, String usuario, String vl) {
		try {
			Conexion conn = new Conexion();
			Connection con = conn.conectar();
			Statement st = con.createStatement();
			st.execute("update usuario set " + columna + "='" + valor + "' where " 
					+ usuario + " = '" + vl + "'");
			st.close();
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void eliminarUsuario(String criterio1, String valor1) {
		try {
			Conexion conn = new Conexion();
			Connection con = conn.conectar();
			Statement st = con.createStatement();
			st.execute("delete from usuario where " + criterio1 + " ='" + valor1 + "'" );
			st.close();
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}