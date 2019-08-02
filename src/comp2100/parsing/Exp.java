package comp2100.parsing;

/**
 * Abstract Expression class
 * @author dongwookim
 *
 */
public abstract class Exp {

	public abstract String show(); // returns parsed expression of the current expression
	public abstract int evaluate(); // returns evaluated value of the current expression
	
}
