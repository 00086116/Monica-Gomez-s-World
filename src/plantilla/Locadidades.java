package plantilla;
import Main.Player;
import java.util.Scanner;

public class Locadidades {
	public String name,itemName;
	public int locationId=-10;
	public boolean item;
	Obstaculo obstacle=new Obstaculo();
	Player player=new Player();
	Inventory inventory=new Inventory();
	Scanner scan=new Scanner(System.in);
	
	public Locadidades(){}
	public Locadidades(Player p , Inventory i)
	{	
		this.player=p;
		this.inventory=i;
	
	}
	public Locadidades(int locationId,String name, String itemName,String obstacleName , Player p, Inventory i)
	{	
		this.locationId=locationId;
		this.name=name;
		this.itemName=itemName;
		this.player=p;
		this.inventory=i;
	} 
	
	public void getLocation()
	{
			System.out.println("===============================================================");
                        int obsNum=obstacle.obstacleNumber();
			System.out.println("Te diriges a " + name + ".");
			System.out.println("¡Ten cuidado! Hay " + obsNum + " tropa(s) de  " + obstacle.getName()+ " en " + name);
			System.out.println(inventory.isFood());
			System.out.println("Inserta *A* para atacar, o *H* para huir: ");
                        System.out.println("===============================================================");
			String combat=scan.next();
			if(combat.equals("A"))
			{
				if(combat(obsNum)==true)
				{
					System.out.println("Destruiste "+ name + ".");
					if(itemName.equals("Lanza rocas") && inventory.isFood()==false)
					{
						System.out.println("Ganaste " + itemName +  ".");
						inventory.setFood(true);
					}
					else if(itemName.equals("Agua") && inventory.isWater()==false)
					{
						System.out.println("Ganaste" + itemName +  ".");
						inventory.setWater(true);
					}
					else if(itemName.equals("Materiales de construccion") && inventory.isFireWood()==false )
					{
						System.out.println("Ganaste" + itemName +  ".");
						inventory.setFireWood(true);
					}
		
					printMenu();
				}
				else
				{
					System.out.println("Lo sentimos, tu raza no resistio, perdiste.");
					System.out.println("GAME OVER");
				}
			}
			else
			{
				printMenu();
			}
		
	}
	
	public boolean combat(int obsNum)
	{
		for(int i=0; i<obsNum;i++)
		{
			int obstacleHealth=obstacle.getHealth();
			
			playerStats();
			enemyStats();
			while(player.health>0 && obstacle.health>0)
			{	
			
			System.out.print("Inserta *A* para atacar, o *H* para huir.");
			String hit=scan.next();
			if(hit.equals("A"))
				{
		
				System.out.println("Atacaste a tu enemigo");
				obstacle.health=obstacle.health-player.damage;
				System.out.println("Vida: " + player.health);
				System.out.println("Vida del enemigo: " + obstacle.health );
				System.out.println();
				System.out.println("El enemigo te ataco");
				player.health=player.health-(obstacle.damage+inventory.getDefend());
				System.out.println("Vida: " + player.health);
				System.out.println("Vida de tu enemigo: " + obstacle.health );
				}
				else
				{
					printMenu();
					break;
				}
			}
			if(obstacle.health<player.health)
			{
				System.out.println("Destruiste a tu enemigo");
				player.money=player.money+obstacle.getMoney();
				player.setMoney(player.money);
				System.out.println("Oro actual :" + 	player.getMoney());
				obstacle.setHealth(obstacleHealth);
			
			
			}
			else
			{
			
				return false;
				
			}
			
		}
		return true;
	}
	
	
	public void playerStats()
	{	String weapon;	
		if(inventory.weaponString!=null)
			 weapon=inventory.weaponString;
		else
			weapon="Bate +0 daño.";
                System.out.println("===============================================================");
		System.out.println("Estadisticas del jugador: \n-------------------------\nVida: " + player.getHealth() +"\nDaño: " + player.getDamage() + "\nArmas:"+ weapon + "\nOro:" + player.getMoney());
		if(inventory.armorString!=null)
		{
			System.out.println(inventory.armorString);
		}
		
	}
	
	public void enemyStats()
	{
		System.out.println("\nEstadisticas del enemigo\n-------------------------\nVida: " +  obstacle.getHealth() +"\nDaño: " + obstacle.getDamage());

	}

	public void printMenu()
	{
		
                System.out.println("===============================================================");
                System.out.println("La supervivencia de tu raza depende de ti, ¿Que deseas hacer? ");
		System.out.println("1. Ir al centro de mando");
		System.out.println("2. Santuario de METAL");
		System.out.println("3. Santuario de TIERRA");
		System.out.println("4. Santuario de AGUA");
		System.out.println("5. Ir a la tienda.");
		System.out.println("0. Ayuda.");
		System.out.print("Tu plan de accion es:");
		int select=scan.nextInt();
		while(select<0 || select>=6)
		{	
			System.out.print("Elegiste:");
			select=scan.nextInt();
		}
                System.out.println("===============================================================");
		if(locationId==select)
		{
			System.out.println("Te encuentras en " + name + ". Elige otra accion");
			printMenu();
		}
		if(select==1)
		{
			Locadidades safehouse=new CentroMando(player,inventory);
			safehouse.getLocation();
		}
		else if(select==2){
			Locadidades restaurant=new SantuarioMe(player,inventory);
			restaurant.getLocation();
		}
		
		else if(select==3){
			Locadidades forest=new SantuarioTierra(player,inventory);
			forest.getLocation();
		}
		
		else if(select==4){
			Locadidades river=new SantuarioA(player,inventory);
			river.getLocation();
		}
		
		else if(select==5){
			Locadidades toolstore=new Establecimiento(player,inventory);
			toolstore.getLocation();
		}
		else {
			
			Locadidades helpcenter=new CentroAyuda(player,inventory);
			helpcenter.getLocation();
		}
		

	}
	
}
