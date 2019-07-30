package comp2100.parsing.advanced;

import java.util.HashMap;
/**
 * 
 * @author Eric McCreath - GPLv2
 * @author dongwookim
 */


public class Boolean extends Expression {
    Expression bool, exp1, exp2;
	
	
	public Boolean(Expression bool, Expression exp1, Expression exp2) {
		super();
		this.bool = bool;
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	public int evaluate(HashMap<String, Integer> vars, Functions functions) {
		return (bool.evaluate(vars,functions) == 0 ? exp1.evaluate(vars,functions) : exp2.evaluate(vars,functions));
	}

	@Override
	public String show() {
		return "(" + bool.show() + "==0?" + exp1.show() + ":" + exp2.show() + ")";
	}

}
