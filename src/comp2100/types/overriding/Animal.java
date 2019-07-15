package comp2100.types.overriding;

public class Animal {
	protected int position;
	
	public Animal() {
		position = 0;
	}
	
	public int move() {
		position += 1;
		return position;
	}
	
	public int getPosition() {
		return position;
	}

}
