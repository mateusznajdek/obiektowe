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
	
	
	/*Zaimplementuj test weryfikuj�cy poprawno�� dzia�ania metody next(), dla wszystkich przypadk�w.
	Uruchom test korzystaj�c z menu Run as.
	Zaimplementuj test weryfikuj�cy poprawno�� dzia�ania metody previous(), dla wszystkich przypadk�w.
	Utw�rz klas� PositionTest.
	Dodaj testy weryfikuj�ce poprawno�� metod: toString(), smaller(Position p), larger(Position p) oraz add(Position p).
	*/
}
