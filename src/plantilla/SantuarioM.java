package plantilla;

import Main.Player;


public class SantuarioM extends Locadidades {

	public SantuarioM(Player p,Inventory i) {
		super.locationId=3;
		super.name="Santuario de raza metal";
		super.itemName="Metales para construccion";
		super.obstacle=new RazaMetal();
		super.player=p;
		super.inventory=i;
		
	}
}
