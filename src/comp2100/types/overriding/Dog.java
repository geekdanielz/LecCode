package comp2100.types.overriding;

public class Dog extends Animal{
	
	public Dog() {
		super();
	}
	
	@Override
	public int move() {
		position += 2;
		return position;
	}
	
}
