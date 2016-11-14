package agh.cs.lab2;

public enum MapDirection {
	North,
	South,
	East,
	West;
	
	public String toString(){
	    switch(this) {
	      case North: return "P�noc";
	      case South: return "Po�udnie";
	      case East: return "Wsch�d";
	      case West: return "Zach�d";
	      default:
	    	  return "Kierunek Nieznany";
	    }
	}
	
	public MapDirection next() {
		switch(this) {
	      case North: return East;
	      case South: return West;
	      case East: return South;
	      case West: return North;
	      	default:
	      		return null;
	    }
	}
	
	public MapDirection previous() {
		switch(this) {
	      case North: return West;
	      case South: return East;
	      case East: return North;
	      case West: return South;
	      	default:
	      		return null;
	    }
	}
}
