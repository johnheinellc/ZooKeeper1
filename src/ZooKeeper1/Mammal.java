package ZooKeeper1;

public class Mammal{
	public double energy = 0;
	
	public Mammal(){
		energy = 100;
	}
	
	
	public double displayEnergy() {
		System.out.println(energy);
		return energy;
	}
	
	public void eatBananas() {
		energy += 10;
		System.out.println("Yummy,... another?");
	}
	
	public void poopScoop() {
		energy -= 5;
		System.out.println("Bombs away!");
	}
	
	public void tacticalPositioning() {
		energy -= 10;
		System.out.println("Retreat!");
	}
}