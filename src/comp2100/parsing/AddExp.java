package comp2100.parsing;

public class AddExp extends Exp {
	private Exp term;
	private Exp exp;

	public AddExp(Exp term, Exp exp) {
		this.term = term;
		this.exp = exp;
	}

	@Override
	public String show() {
		return "(" + term.show() + " + " + exp.show() + ")";
	}

}
