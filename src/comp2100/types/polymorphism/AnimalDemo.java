package comp2100.types.polymorphism;

public class AnimalDemo {

	/**
	 * An example of polymorphism with {@link Deer} class.
	 * @param args
	 */
	public static void main(String args[]) {
		Deer deer = new Deer();
		// upcasting: superclass variable can refer to a subclass object
		Animal deerAnimal = deer;
		Vegetarian deerVegetarian = deer;
		Object deerObject = deer;
		
		Elephant elephant = new Elephant();
		Animal elephantAnimal = elephant;
		Vegetarian elephantVegetarian = elephant;
		Object elephantObject = elephant;		
		
		Animal[] animalArray = {deer, elephant};
		Vegetarian[] vegetarianArray = {deerVegetarian, elephantVegetarian};
		
		for (Animal animal : animalArray) {
			animal.run();
			//animal.eatVegetable(); // Error
		}
		
		for (Vegetarian vegetarian : vegetarianArray) {
			vegetarian.eatVegetable();
			//vegetarian.run(); // Error
		}
	}

}
