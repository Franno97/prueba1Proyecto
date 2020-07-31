package prueba1;

public class Averia {
	//Atributos
	String id_averia;
	String tipo_averia;
	
	//Constructores
	
	public Averia() {
		
	}
	public Averia(String id_averia, String tipo_averia) {
		this.id_averia = id_averia;
		this.tipo_averia = tipo_averia;
	}
	public void setIdAv(String id_averia) {
		this.id_averia = id_averia;
	}
	public void setTipoAv(String tipo_averia) {
		this.tipo_averia = tipo_averia;
	}
}
