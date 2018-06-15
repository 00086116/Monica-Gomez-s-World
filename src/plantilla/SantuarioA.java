package plantilla;

import Main.Player;


public class SantuarioA  extends Locadidades{

	public SantuarioA(Player p,Inventory i) {
		super.locationId=4;
		super.name="Santuario de raza agua";
		super.itemName="Agua";
		super.obstacle=new RazaAgua();
		super.player=p;
		super.inventory=i;
		
	}
}
