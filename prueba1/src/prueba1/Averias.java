package prueba1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Averias {
	public List ObtenerAverias() {
		List<Averia> listaContactos=new LinkedList<Averia>();
	      try
	      {
	         Conexion conn = new Conexion();
	    	 Connection con = conn.conectar();
	         Statement st = con.createStatement();
	         ResultSet rs = st.executeQuery("select * from averia" );
	         while (rs.next())
	         {
	            Averia contacto = new Averia();
	            contacto.setIdAv(rs.getString("id_averia"));
	            contacto.setTipoAv(rs.getString("tipo_averia"));
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
	public void insertarAveria(String id_averia, String tipo_averia) {
		try {
			Conexion conn = new Conexion();
	   	 	Connection con = conn.conectar();
	        Statement st = con.createStatement();
	        st.execute("insert into averia values('" + id_averia + "','" + tipo_averia + "')");
	        st.close();
	        con.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void modificarAveria(String columna, String valor, String usuario, String vl) {
		try {
			Conexion conn = new Conexion();
			Connection con = conn.conectar();
			Statement st = con.createStatement();
			st.execute("update averia set " + columna + "='" + valor + "' where " 
					+ usuario + " = '" + vl + "'");
			st.close();
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void eliminarAveria(String criterio1, String valor1) {
		try {
			Conexion conn = new Conexion();
			Connection con = conn.conectar();
			Statement st = con.createStatement();
			st.execute("delete from averia where " + criterio1 + " ='" + valor1 + "'" );
			st.close();
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
