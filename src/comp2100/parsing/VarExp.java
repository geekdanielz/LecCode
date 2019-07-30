package comp2100.parsing;

public class VarExp extends Exp {
	private String variable;

	public VarExp(String variable) {
		this.variable = variable;
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return variable;
	}

}
