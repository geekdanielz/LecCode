package comp2100.parsing;

public class MultExp extends Exp {
	private Exp factor;
	private Exp term;

	public MultExp(Exp factor, Exp term) {
		// TODO Auto-generated constructor stub
		this.factor = factor;
		this.term = term;
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return "(" + factor.show() + "*" + term.show() + ")";
	}

}
