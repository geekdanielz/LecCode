package comp2100.parsing;

import comp2100.parsing.tokenizer.Tokenizer;

/**
 * Parser for grammar:
 * 
 * <exp> ::= <term> | <term> + <exp>
 * <term> ::= <factor> | <fator> * <term>
 * <factor> ::= <lit> | <var>
 *  
 * @author dongwookim
 *
 */
public class Parser {
	
	public static Exp parseExp(Tokenizer tok) {
		Exp term = parseTerm(tok);
		tok.next();

		if(tok.current().equals("+")) {
			tok.next();
			Exp exp = parseExp(tok);
			return new AddExp(term, exp);
		}else {
			return term;
		}
	}
	
	public static Exp parseTerm(Tokenizer tok) {
		Exp factor = parseFactor(tok);
		tok.next();
		
		if (tok.current().equals("*")) {
			tok.next();
			Exp term = parseTerm(tok);
			return new MultExp(factor, term);
		}else {
			return factor;
		}
	}

	private static Exp parseFactor(Tokenizer tok) {
		if(tok.current() instanceof Integer) {
			Exp lit = new LitExp((Integer)tok.current());
			tok.next();
			return lit;
		}else {
			Exp var = new VarExp((String)tok.current());
			tok.next();
			return var;
		}
		
	}

}
