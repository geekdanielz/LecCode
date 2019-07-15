package comp2100.types.overriding;

public class Deer extends Animal{
	
	public Deer() {
		super();
	}
	
	@Override
	public int move() {
		position += 3;
		return position;
	}

}
