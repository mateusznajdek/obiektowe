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
	
	/*Zaimplementuj test weryfikuj¹cy poprawnoœæ dzia³ania metody next(), dla wszystkich przypadków.
	Uruchom test korzystaj¹c z menu Run as.
	Zaimplementuj test weryfikuj¹cy poprawnoœæ dzia³ania metody previous(), dla wszystkich przypadków.
	Utwórz klasê PositionTest.
	Dodaj testy weryfikuj¹ce poprawnoœæ metod: toString(), smaller(Position p), larger(Position p) oraz add(Position p).
	*/
}
