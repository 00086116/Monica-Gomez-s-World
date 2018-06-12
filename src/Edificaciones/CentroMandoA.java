package Edificaciones;
import jugadores.Player1;
import locacion;


    
public class CentroMandoA extends Locacion {

	public CentroMandoA(Player1 p,Recurso1 i) {
		super.locacionId=1;
		super.name="Centro de Mando de la raza agua";
		super.itemName="Fire Wood";
		super.obstacle=new Agua();
		super.player1=p;
		super.Recurso1=i;
		
	}
}
