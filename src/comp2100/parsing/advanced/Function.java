package comp2100.parsing.advanced;


import java.util.ArrayList;

import comp2100.parsing.tokenizer.Tokenizer;


/**
 * Function class defined by name, parameters and the function body({@code exp}).
 * The function text should be defined as
 *   func_text ( some_parameters ) = some_expression 
 * 
 * @author Eric McCreath - GPLv2
 * @author dongwookim
 */


public class Function {
    public String name;
    public ArrayList<String> parameters;
    public Expression exp;
     
	public static Function parse(Tokenizer tok) throws ParseException {
		Function res = new Function();
		if (!(tok.current() instanceof String))  throw new ParseException();
		res.name = (String) tok.current();
		tok.next();
		res.parameters =  new ArrayList<String>();
		tok.parse("(");
		
		String var;
		while (!")".equals(tok.current())) {
			var = (String) tok.current();
			res.parameters.add(var);
			tok.next();
			if (tok.current().equals(",")) tok.next();
		}
		tok.parse(")");
		tok.parse("=");
		res.exp = Expression.parse(tok);
		return res;
	}

	public String show() {
		String varstr = "";
		for (int i = 0; i< parameters.size(); i++) varstr += parameters.get(i) + (i <parameters.size()-1?",":""); 
		return name + "(" + varstr + ")=" + exp.show();
	}
    
}
