package plantilla;

import Main.Player;


public class SantuarioMe extends Locadidades {

	public SantuarioMe(Player p,Inventory i) {
		super.locationId=2;
		super.name="Santuario de raza metal";
		super.itemName="Metales para construccion";
		super.obstacle=new RazaMetal();
		super.player=p;
		super.inventory=i;
		
	}
}
