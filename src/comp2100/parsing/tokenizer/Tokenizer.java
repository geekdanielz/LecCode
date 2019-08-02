package comp2100.parsing.tokenizer;

/**
 * Tokenizer - this uses the StreamTokenizer class to make a simpler tokenizer
 * which provides a stream of tokens which are either Integer, Double, or
 * String.
 * 
 * @author Eric McCreath
 * @author dongwookim
 * 
 */

public abstract class Tokenizer {

	public abstract boolean hasNext();

	public abstract Object current();

	public abstract void next();

	public void parse(Object o) throws ParseException {
		if (current() == null || !current().equals(o))
			throw new ParseException();
		next();
	}
}
