package comp2100.tree.btree;

/**
 * NameTable - a simple interface for a table for peoples names. 
 * This table is indexed via an id. 
 * @author Eric McCreath - 2015
 * @author dongwookim - generalise via generics
 */
public interface Table<K extends Comparable<K>, V> {
	V lookup(K id);
	void insert(K id, V name);
}
