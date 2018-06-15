package plantilla;

import Main.Player;


public class Establecimiento extends Locadidades{
	public int id,avoid,money,damage;
	public String name;
	public Establecimiento(Player p,Inventory i) {
		super.locationId=5;
		super.name="Establecimiento";
		super.player=p;
		super.inventory=i;
		
	}
	public void getLocation()
	{
		System.out.println("===============================================================");
                System.out.println("Bienvenida al establecimiento");
		System.out.println("¿Que deseas hacer? \n1. Equipar con armas. \n2. Equipar con armaduras. \n3.Regresar");
		System.out.println("Tu eleccion es :");
                System.out.println("===============================================================");
		int select=scan.nextInt();
		if(select==1)
		{
			buyWeaponMenu();
			
		}
		else if(select==2)
		{
			buyArmorMenu();
		}
		else
		{
			printMenu();
		}
		
	}
	
	public void weaponType(int id)
	{
		if(id==1)
		{
			this.id=1;
			this.name="Espadas";
			this.damage=2;
			this.money=25;
		}
		else if(id==2)
		{
			this.id=2;
			this.name="Bombas";
			this.damage=4;
			this.money=35;
			
		}
		else
		{	this.id=3;
			this.name="Hachas";
			this.damage=7;
			this.money=45;
		}
			
	}
	public void armorType(int id)
	{
		if(id==1)
		{	this.id=1;
			this.name="Armadura ligera";
			this.avoid=-1;
			this.money=15;
		}
		else if(id==2)
		{	this.id=2;
			this.name="Armadura mediana";
			this.avoid=-3;
			this.money=25;
			
		}
		else
		{	this.id=3;
			this.name="Armadura pesada";
			this.avoid=-5;
			this.money=40;
		}
			
	}
	
	
	

	public void buyWeapon(int id)
	{
	
			weaponType(id);
			if(player.getMoney()>=money)
			{
				
				player.setMoney(player.getMoney()-money);
				player.setDamage(player.getDamage()+damage);
				System.out.println("Estas equipada con " + name);
				inventory.addWeapon(this.id,this.name,this.damage);
			
			}
			else
			{
                            System.out.println("Tu oro es de "+player.getMoney() );
                            System.out.println("No tienes suficientes recursos.");
				
			}
		
		
	}
	
	public void buyArmor(Obstaculo o,int id)
	{
	
			armorType(id);
		
			if(player.getMoney()>=money)
			{
				
				player.setMoney(player.getMoney()-money);
				inventory.defend(this.avoid);
				System.out.println("Estas equipada con " + name);
				inventory.addArmor(this.id,this.name,this.avoid);
				
			}
			else
			{
				System.out.println("No tienes suficientes recursos.");
			}
		
		
	}
	
	public void buyWeaponMenu()
	{
		System.out.println("===============================================================");
		System.out.println("1. Espada ||Precio: 25 || Daño +2");
		System.out.println("2. Bomba  ||Precio: 34 || Daño +4");
		System.out.println("3. Hacha  ||Precio: 45 || Daño +7");
		System.out.println("4. Regresar.");
		System.out.println("Elegiste la opcion");
                System.out.println("===============================================================");
		int select=scan.nextInt();
		if(select!=4){
			buyWeapon(select);
			printMenu();
		}
		else
			printMenu();
	}
	
	
	public void buyArmorMenu()
	{
	
		Obstaculo o=new Obstaculo();
                System.out.println("===============================================================");
		System.out.println("1. Liviana ||Precio: 15 ||Daño -1");
		System.out.println("2. Mediana ||Precio: 25 ||Daño -3");
		System.out.println("3. Pesada  ||Precio: 40 ||Daño -5");
		System.out.println("4. Regresar.");
		System.out.println("Elegiste la opcion: ");
                System.out.println("===============================================================");
		int select=scan.nextInt();
		if(select!=4){
			buyArmor(o,select);
			printMenu();
		}
		else
			printMenu();
	}
}
