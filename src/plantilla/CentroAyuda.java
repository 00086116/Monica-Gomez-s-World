package plantilla;

import Main.Player;


public class CentroAyuda extends Locadidades {

	public CentroAyuda(Player p , Inventory i)
	{
		super.locationId=0;
		super.name="Centro de ayuda.";
		super.player=p;
		super.inventory=i;
		
	}
	
        @Override
	public void getLocation()
	{
		System.out.println("\n           EDIFICACIONES ");
		System.out.println("******************************************");
		System.out.println("1. Centro de mando");
		System.out.println("2. Santuario de raza metal");
		System.out.println("3. Santuario de raza tierra");
		System.out.println("4. Santuario de agua");
		System.out.println("5. Tienda.");
		System.out.println("\n              RAZAS ");
		System.out.println("******************************************");
		System.out.println("1.Raza agua   ||Vida:10 ||Daño:3 ||Oro:10");
		System.out.println("2.Raza tierra ||Vida:14 ||Daño:4 ||Oro:14");
		System.out.println("3.Raza metal  ||Vida:20 ||Daño:7 ||Oro:20");
		System.out.println("\n              ARMAMENTO");
		System.out.println("******************************************");
		System.out.println("0. Bate ||Arma por defecto ||Daño +0");
		System.out.println("1. Espada ||Precio: 25 ||Daño +2");
		System.out.println("2. Bomba  ||Precio: 34 ||Daño +4");
		System.out.println("3. Hacha  ||Precio: 45 ||Daño +7");
		System.out.println("\n              ARMADURAS");
		System.out.println("******************************************");
		System.out.println("1. Liviana ||Precio: 15 ||Daño -1");
		System.out.println("2. Mediana ||Precio: 25 ||Daño -3");
		System.out.println("3. Pesada  ||Precio: 40 ||Daño -5");
		System.out.println("\n               MISIONES");
		System.out.println("******************************************");
		System.out.println("1. Go to the Restaurant. Kill all the zombies .Gain FOOD item!");
		System.out.println("2. Go to the Forest. Kill all the vampires .Gain FIREWOOD item!");
		System.out.println("3. Go to the Riverside. Kill all the bears .Gain WATER item!");	
		System.out.println("4. Regresar al centro de mando con todo lo recolectado");
		printMenu();
	}
}
