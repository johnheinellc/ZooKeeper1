package ZooKeeper1;

public class Mammal{
	public double energy = 0;
	
	public Mammal(){
		energy = 100;
	}
	public bat(){
		energy = 300;
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
		
	public void fly() {
		energy -= 50;
		System.out.println("Woosh Woosh Woosh!");
	}
		
	public void eatHumans() {
		energy += 25;
	}
	
	public void attackTowns() {
		energy -= 100;
		System.out.println("Help me, 7lb 5oz Baby Jesus!");
	}
		
		
}