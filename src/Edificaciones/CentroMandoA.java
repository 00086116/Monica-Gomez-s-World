package Edificaciones;
    
public class CentroMandoA extends Locacion {

	public CentroMandoA(Player1 p,Inventory i) {
		super.locationId=1;
		super.name="Centro de Mando de la raza agua";
		super.itemName="Fire Wood";
		super.obstacle=new Vampire();
		super.player=p;
		super.inventory=i;
		
	}
}
