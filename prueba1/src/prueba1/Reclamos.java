package prueba1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Reclamos {
	public List ObtenerReclamos() {
		List<Reclamo> listaContactos=new LinkedList<Reclamo>();
	      try
	      {
	         Conexion conn = new Conexion();
	    	 Connection con = conn.conectar();
	         Statement st = con.createStatement();
	         ResultSet rs = st.executeQuery("select * from reclamo" );
	         while (rs.next())
	         {
	            Reclamo contacto = new Reclamo();
	            contacto.setIdRec(rs.getString("id_reclamo"));
	            contacto.setIdCl(rs.getString("id_cliente"));
	            contacto.setIdAv(rs.getString("id_averia"));
	            contacto.setCanalR(rs.getString("canal_req"));
	            contacto.setFechaReporte(rs.getString("fech_reporte"));  
	            contacto.setFechaRepar(rs.getString("fecha_reparacion"));
	            contacto.setTiempo(rs.getString("tiempo_rep"));
	            contacto.setDesc(rs.getString("descripcion"));
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
	public void insertarReclamo(String id_reclamo, String id_cliente, String id_averia, String canal_req, 
			String fech_reporte, String fech_reparacion, String tiempo_rep, String descripcion ) {
		try {
			Conexion conn = new Conexion();
	   	 	Connection con = conn.conectar();
	        Statement st = con.createStatement();
	        st.execute("insert into reclamo values('" + id_reclamo + "','" 
	        		+ id_cliente + "','" + id_averia + "','" + canal_req + "','" 
	        		+ fech_reporte + "','" + fech_reparacion + "','" + tiempo_rep + "','" 
	        		+ descripcion + "')");
	        st.close();
	        con.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void modificarReclamo(String columna, String valor, String usuario, String vl) {
		try {
			Conexion conn = new Conexion();
			Connection con = conn.conectar();
			Statement st = con.createStatement();
			st.execute("update reclamo set " + columna + "='" + valor + "' where " 
					+ usuario + " = '" + vl + "'");
			st.close();
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void eliminarReclamo(String criterio1, String valor1) {
		try {
			Conexion conn = new Conexion();
			Connection con = conn.conectar();
			Statement st = con.createStatement();
			st.execute("delete from reclamo where " + criterio1 + " ='" + valor1 + "'" );
			st.close();
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
