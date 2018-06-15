package Main;


import plantilla.Inventory;
import plantilla.Locadidades;
import Main.Player;
import java.util.Scanner;
public class Menu {
        public static int fase = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
                System.out.println("************** BIENVENIDO A MONICA GOMEZ'S WORLD **************");
                System.out.println("===============================================================");
                System.out.println("El mundo donde diferentes seres lucharan por su sobrevivencia."); 
                System.out.println("\t¿En que bando estas? ¿Tu raza sobrevivira?");
                System.out.println("\tSumergete a este mundo.¡¡Buena suerte!! ");
                System.out.println("===============================================================");
                System.out.println("Ingresar alias:");
		System.out.print("Jugador 1: ");
		String name = scan.nextLine();
		Player player= new Player(name);
		Inventory inventory=new Inventory();
		player.characterMenu();
		player.toCharacter();
		Locadidades local=new Locadidades(player,inventory);
		local.printMenu();
		
	}

}
