package javalab;

public class interfaceinheritance {
	public static void main(String [] args) {
		Fish fish=new Fish();
		System.out.println("FISH");
		fish.setName("Mimi");
		System.out.println("The fish's name is "+fish.getName());
		fish.eat();
		fish.walk();
		fish.setName("Momo");
		System.out.println("The fish's name is "+fish.getName());
		Cat cat =new Cat();
		System.out.println("CAT");
		cat.setName("Fluffy");
		System.out.println("The cat's name is "+cat.getName());
		cat.walk();
		cat.eat();
		cat.setName("Moose");
		System.out.println("The cat's name is "+cat.getName());
		System.out.println(" ");
		System.out.println("SPIDER");
		Spider spider =new Spider();
		spider.eat();
		spider.walk();
		
	}

}
abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
		
	}
	public abstract void eat();
	public void walk() {
		System.out.println("This animal walks on "+legs+" legs");
	}
}
class Spider extends Animal{
	public Spider(){
		super(8);
	}
	public void eat() {
		System.out.println("The spider is eating");
	}
}
interface Pet{
	String getName();
	void setName(String name);
	void play();
	
}
class Cat extends Animal implements Pet{
	private String name;
	public Cat (String name) {
		super(4);
		this.name= name;
		
		
	}
	public Cat() {
		this(" ");
	}
	
	public void eat() {
		System.out.println("The cat is eating");
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return this.name;
	}
	public void play() {
		System.out.println("The cat is playing");
	}
}
class Fish extends Animal implements Pet{
	private String name;
	public Fish () {
		super(0);		
		
	}
	
	public void eat() {
		System.out.println("The fish eats plants");
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return this.name;
	}
	public void play() {
		System.out.println("The fish is playing");
	}
	public void walk() {
		System.out.println("Fish can't walk");
	}
}