package agh.cs.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTest {

	@Test
	public void testToString() {
		assertEquals("(1,2)", new Position(1,2).toString());
	}
	
	@Test
	public void testSmaller() {
		assertTrue(new Position(1,2).smaller(new Position(3,4)));
		assertFalse(new Position(3,4).smaller(new Position(1,2)));
	}
	@Test
	public void testLarger() {
		assertFalse(new Position(1,2).larger(new Position(3,4)));
		assertTrue(new Position(3,4).larger(new Position(1,2)));
	}
	@Test
	public void testAdd(){
		assertEquals(new Position(3,4), new Position(1,1).add(new Position(2,3)));
	}
	
	/*Zaimplementuj test weryfikuj�cy poprawno�� dzia�ania metody next(), dla wszystkich przypadk�w.
	Uruchom test korzystaj�c z menu Run as.
	Zaimplementuj test weryfikuj�cy poprawno�� dzia�ania metody previous(), dla wszystkich przypadk�w.
	Utw�rz klas� PositionTest.
	Dodaj testy weryfikuj�ce poprawno�� metod: toString(), smaller(Position p), larger(Position p) oraz add(Position p).
	*/
}
