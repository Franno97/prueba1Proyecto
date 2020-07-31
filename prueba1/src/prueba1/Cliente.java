package prueba1;

public class Cliente {
	//Atributos
	String cedula;
	String nombre;
	String apellido;
	String num_telefonico;
	String provincia;
	String tipo_conexion;
	
	//Constructores
	public Cliente(){
		
	}
	public Cliente(String cedula, String nombre, String apellido, String num_telefonico, String provincia, String tipo_conexion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.num_telefonico = num_telefonico;
		this.provincia = provincia;
		this.tipo_conexion = tipo_conexion;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setNumTel(String num_tel) {
		this.num_telefonico = num_tel;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public void setTipoCon(String tipo_con) {
		this.tipo_conexion = tipo_con;
	}
}
