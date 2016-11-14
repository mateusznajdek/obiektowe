package agh.cs.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MapDirectionTest {

	@Test
	public void testNext() {
		assertEquals(MapDirection.North.next(), MapDirection.East);
		assertEquals(MapDirection.East.next(), MapDirection.South);
		assertEquals(MapDirection.South.next(), MapDirection.West);
		assertEquals(MapDirection.West.next(), MapDirection.North);
		
	}
	
	@Test
	public void testPrevious() {
		assertEquals(MapDirection.North.previous(), MapDirection.West);
		assertEquals(MapDirection.East.previous(), MapDirection.North);
		assertEquals(MapDirection.South.previous(), MapDirection.East);
		assertEquals(MapDirection.West.previous(), MapDirection.South);
		
	}
	
	
	/*Zaimplementuj test weryfikuj¹cy poprawnoœæ dzia³ania metody next(), dla wszystkich przypadków.
	Uruchom test korzystaj¹c z menu Run as.
	Zaimplementuj test weryfikuj¹cy poprawnoœæ dzia³ania metody previous(), dla wszystkich przypadków.
	Utwórz klasê PositionTest.
	Dodaj testy weryfikuj¹ce poprawnoœæ metod: toString(), smaller(Position p), larger(Position p) oraz add(Position p).
	*/
}
