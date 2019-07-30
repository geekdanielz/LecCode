package comp2100.tree.btree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStrTableTest {
	private Table<Integer, String> table;
	
	@Before
	public void constructBtreeTable() {
		table = new BtreeNode<Integer, String>();
		table.insert(1, "Batman");
		table.insert(2, "Superman");

	}
	
	@Test
	public void testBatmanId() {
		assertEquals("Batman", table.lookup(1));
	}
	
	@Test
	public void testSupermanId() {
		assertEquals("Superman", table.lookup(2));
	}
}
