package prueba1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int op;
		Scanner entrada = new Scanner(System.in);
		Usuarios obj = new Usuarios();
		//obj.ObtenerUsuarios();

		do {
			System.out.println("1) Insertar Usuario. ");
			System.out.println("2) Modificar Usuario. ");
			System.out.println("3) Eliminar Usuario. ");
			System.out.println("0) Salir. ");
			System.out.println("Ingrese la op: ");
			op = entrada.nextInt();
			switch (op){
			case 1: 
				obj.insertarUsuario("FranciscoL", "0604319673", "Francisco", "1234", "pancholobato@gmail.com");
				System.out.println("Usuario Ingresado.");
				break;
			case 2: 
				obj.modificarUsuario("ID", "0604319670", "nickname", "FranciscoL");
				System.out.println("Campos modificados.");
				break;
			case 3: 
				obj.eliminarUsuario("nickname", "FranciscoL");
				System.out.println("Usuario Eliminado.");
				break;
			case 0:
				System.out.println("Saliendo.");
				break;
			default:
				System.out.println("Opcion incorrecta.");
			}
		}while(op!=0);
	}
}
