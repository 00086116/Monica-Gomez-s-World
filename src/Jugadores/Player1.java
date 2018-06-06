package Jugadores;

/**
 *
 * @author Monica Gomez
 */
import java.util.Scanner;

public class Player1 {
	public String usuario , nombre, tipo;
	public int id ,vida , danio , dinero ,realvida;
	
	public Player1(){}
	
	public Player1(String  nombre)
	{
		this.usuario=nombre;
	
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDanio() {
		return danio;
	}

	public void setDanio(int danio) {
		this.danio = danio;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public void characterMenu()
	{
		System.out.println("Bienvenidos al juego Monica Gomez's World" + usuario + "\nSeleccionar una raza\n 1.Agua\n2.Fuego\n3.Metal\n4.Tierra ");
		Scanner scan = new Scanner(System.in);
		System.out.print("Tu raza es: ");
		id=scan.nextInt();
		selectCharacter(id);
	}
	
	public void selectCharacter(int id)
	{
            switch (id) {
                case 1:
                    nombre = "Agua";
                    vida=21;
                    realvida=21;
                    danio=5;
                    dinero =15;
                    break;
                case 2:
                    nombre = "Fuego";
                    vida=18;
                    realvida=18;
                    danio=7;
                    dinero =20;
                    break;
                case 3:
                    nombre = "Metal";
                    vida=18;
                    realvida=18;
                    danio=7;
                    dinero =20;
                    break;
                default:
                    nombre = "Tierra";
                    realvida=24;
                    vida=24;
                    danio=8;
                    dinero =5;
                    break;
            }
	}
	
	public void setVida(int vida)
	{
		this.vida=vida;
	}
	public int getVida()
	{
		return vida;
	}
	
	public void setrealVida(int vida)
	{
		this.realvida=vida;
	}
	public int getrealVida()
	{
		return realvida;
	}
	
	public void toCharacter()
	{
		System.out.println("Raza lista para combatir! ID=" + id + ",Nombre=" + nombre +",Vida" +vida +",Daño=" + danio +",Dinero="+dinero);
	}
}


