package plantilla;


import Main.Player;


public class SantuarioTierra extends Locadidades{

	public SantuarioTierra(Player p,Inventory i) {
		super.locationId=3;
		super.name="Santuario de raza tierra";
		super.itemName="Lanza rocas";
		super.obstacle=new RazaTierra();
		super.player=p;
		super.inventory=i;
		
	}

	

	
}
