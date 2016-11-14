package agh.cs.lab2;

public class Position {
	public final int x;
	public final int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public boolean smaller(Position other) {
		if (other.x > this.x && other.y > this.y)
			return true;
		return false;
	}
	
	public boolean larger(Position other) {
		if (other.x < this.x && other.y < this.y)
			return true;
		return false;
	}
	
	public Position add(Position p2){
		Position p3 = new Position(this.x+p2.x,this.y+p2.y);
		return p3;
	}
	
	public boolean equals(Object other){
		if(this == other)
			return true;
		if(!(other instanceof Position))
			return false;
		
		Position that = (Position) other;
		
		if((this.x == that.x) && (this.y == that.y))
			return true;
		return false;
		
	}
}
