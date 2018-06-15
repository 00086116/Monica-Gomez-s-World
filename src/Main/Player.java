package Main;

import java.util.Scanner;

public class Player {
	public String playerName , name, type;
	public int id ,health , damage , money ,realHealth;
	
	public Player(){}
	
	public Player(String name)
	{
		this.playerName=name;
	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void characterMenu()
	{
		System.out.println( "Bienvenido" + playerName + "\n Selecciona una raza \n1)Raza agua\n2)Raza tierra\n3)Raza metal");
		Scanner scan = new Scanner(System.in);
		System.out.print("Elegiste: ");
		id=scan.nextInt();
		selectCharacter(id);
	}
	
	public void selectCharacter(int id)
	{
		if(id==1)
		{
			name = "Raza agua";
			health=21;
			realHealth=21;
			damage=5;
			money =15;
			}
		else if(id==2)
		{
			name = "Raza tierra";
			health=18;
			realHealth=18;
			damage=7;
			money =20;
		}
		else
		{
			name = "Raza Metal";
			realHealth=24;
			health=24;
			damage=8;
			money =5;
		}
	}
	
	public void setHealth(int health)
	{
		this.health=health;
	}
	public int getHealth()
	{
		return health;
	}
	
	public void setrealHealth(int health)
	{
		this.realHealth=health;
	}
	public int getrealHealth()
	{
		return realHealth;
	}
	
	public void toCharacter()
                
	{
		
	}
}
