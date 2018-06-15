package plantilla;


import Main.Player;


public class SantuarioT extends Locadidades{

	public SantuarioT(Player p,Inventory i) {
		super.locationId=2;
		super.name="Santuario de raza tierrao";
		super.itemName="Lanza rocas";
		super.obstacle=new RazaTierra();
		super.player=p;
		super.inventory=i;
		
	}

	

	
}
