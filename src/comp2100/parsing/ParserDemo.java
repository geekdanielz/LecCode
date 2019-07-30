package comp2100.parsing;

import comp2100.parsing.tokenizer.MySimpleTokenizer;
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
public class ParserDemo {

	final static String exp = "3+4+abc*7*def";
	
	public static void main(String[] args) {
		Tokenizer tok = new MySimpleTokenizer(exp);
		
		Exp parsedExp = Parser.parseExp(tok);
		
		System.out.println(parsedExp.show());
	}
}
