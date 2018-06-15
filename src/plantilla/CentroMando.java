package plantilla;

import Main.Player;


public class CentroMando extends Locadidades {
	
	public CentroMando(Player p,Inventory i) {
		super.locationId=1;
		super.name="Centro de Mando";
		super.player=p;
		super.inventory=i;
		
	}
	
	public void getLocation()
	{
		
	
	
		if(inventory.isFireWood()==true && inventory.isFood()==true && inventory.isWater()==true)
		{
			System.out.println("Buena estrategia, tu raza tiene lo que necesitaba");
			System.out.println("¡GANASTE!");
		}
		else{
		
		player.setHealth(player.getrealHealth());
		System.out.println("No tienes daños.");

	
		printMenu();
		}
	}

}
