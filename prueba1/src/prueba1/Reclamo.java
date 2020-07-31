package prueba1;

public class Reclamo {
	//Atributos
	String id_reclamo;
	String id_cliente;
	String id_averia;
	String canal_req;
	String fech_reporte;
	String fech_reparacion;
	String tiempo_rep;
	String descripcion;
	
	//Constructores
	
	public Reclamo() {
		
	}
	public Reclamo(String id_reclamo, String id_cliente, String id_averia, 
			String canal_req, String fech_reporte, String fech_reparacion,
			String tiempo_rep, String descripcion) {
		this.id_reclamo = id_reclamo;
		this.id_cliente = id_cliente;
		this.id_averia = id_averia;
		this.canal_req = canal_req;
		this.fech_reporte = fech_reporte;
		this.fech_reparacion = fech_reparacion;
		this.tiempo_rep = tiempo_rep;
		this.descripcion = descripcion;
	}
	public void setIdRec(String id_reclamo) {
		this.id_reclamo = id_reclamo;
	}
	public void setIdCl(String id_cliente) {
		this.id_cliente = id_cliente;
	}
	public void setIdAv(String id_averia) {
		this.id_averia = id_averia;
	}
	public void setCanalR(String canal_req) {
		this.canal_req = canal_req;
	}
	public void setFechaReporte(String fech_reporte) {
		this.fech_reporte = fech_reporte;
	}
	public void setFechaRepar(String fech_reparacion) {
		this.fech_reparacion = fech_reparacion;
	}
	public void setTiempo(String tiempo_rep) {
		this.tiempo_rep = tiempo_rep;
	}
	public void setDesc(String descripcion) {
		this.descripcion = descripcion;
	}
}
