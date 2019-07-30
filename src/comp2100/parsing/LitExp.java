package comp2100.parsing;

public class LitExp extends Exp {
	private Integer value;

	public LitExp(Integer value) {
		this.value = value;
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return value.toString();
	}

}
