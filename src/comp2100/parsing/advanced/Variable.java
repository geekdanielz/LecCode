package comp2100.parsing.advanced;

import java.util.HashMap;

/**
 *  
 * @author Eric McCreath - GPLv2
 * @author dongwookim
 */

public class Variable extends Expression {
    String var;
    
    public Variable(String var) {
		this.var = var;
	}
	
	@Override
	public int evaluate(HashMap<String, Integer> vars, Functions functions) {
		return vars.get(var);
	}

	@Override
	public String show() {
		
		return var;
	}

}
