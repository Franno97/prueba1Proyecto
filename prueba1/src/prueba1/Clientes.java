package prueba1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Clientes {
	public List ObtenerClientes() {
		List<Cliente> listaContactos=new LinkedList<Cliente>();
	      try
	      {
	         Conexion conn = new Conexion();
	    	 Connection con = conn.conectar();
	         Statement st = con.createStatement();
	         ResultSet rs = st.executeQuery("select * from cliente" );
	         while (rs.next())
	         {
	            Cliente contacto = new Cliente();
	            contacto.setCedula(rs.getString("cedula"));
	            contacto.setNombre(rs.getString("nombre"));
	            contacto.setApellido(rs.getString("apellido"));
	            contacto.setNumTel(rs.getString("num_telefonico"));
	            contacto.setProvincia(rs.getString("provincia"));  
	            contacto.setTipoCon(rs.getString("tipo_conexion"));
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
	public void insertarCliente(String cedula, String nombre, String apellido, String num_telefonico, 
			String provincia, String tipo_conexion) {
		try {
			Conexion conn = new Conexion();
	   	 	Connection con = conn.conectar();
	        Statement st = con.createStatement();
	        st.execute("insert into cliente values('" + cedula + "','" 
	        		+ nombre + "','" + apellido + "','" + num_telefonico + "','" 
	        		+ provincia + "','" + tipo_conexion + "')");
	        st.close();
	        con.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void modificarCliente(String columna, String valor, String usuario, String vl) {
		try {
			Conexion conn = new Conexion();
			Connection con = conn.conectar();
			Statement st = con.createStatement();
			st.execute("update cliente set " + columna + "='" + valor + "' where " 
					+ usuario + " = '" + vl + "'");
			st.close();
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void eliminarCliente(String criterio1, String valor1) {
		try {
			Conexion conn = new Conexion();
			Connection con = conn.conectar();
			Statement st = con.createStatement();
			st.execute("delete from cliente where " + criterio1 + " ='" + valor1 + "'" );
			st.close();
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}