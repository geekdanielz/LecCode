package comp2100.types.overriding;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal deer = new Deer(); //polymorphism
		Animal dog = new Dog(); //polymorphism
		
		Animal[] animals = {deer, dog};
		
		for (Animal a : animals) {
			a.move();  // which method will be called? move in Animal class or overriden move in Subclass?
		}
		
		System.out.println("Position of Deer :" + deer.getPosition());
		System.out.println("Position of Deer :" + dog.getPosition());
	}
}
