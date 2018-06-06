
package Mundo;
import Jugadores.Player1;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nombre de usuario para jugador 1: ");
		String name = scan.nextLine();
		Player1 player1= new Player1(name);
		

		
	}

}