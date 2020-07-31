package prueba1;
public class Usuario {
	//Atributos
	String nickname;
	String ID;
	String nombre;
	String password;
	String email;
	
	//Constructores
	public Usuario()
	{
		
	}
	
	public Usuario(String nickname, String ID, String nombre, String password, String email) {
		this.nickname = nickname;
		this.ID = ID;
		this.nombre = nombre;
		this.password = password;
		this.email = email;
	}
	//Metodos
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
