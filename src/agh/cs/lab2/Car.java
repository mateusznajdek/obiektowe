package agh.cs.lab2;

public class Car {
	private Position carPosition;
	private MapDirection carDirection;
	
	public Car(){
		this.carPosition = new Position(2,2);
		this.carDirection = MapDirection.North;			
	}
	
	public String toString(){
		return "pozycja: "+carPosition.toString()+" orientacja: "+carDirection.toString();
	}
	
	public void move(MoveDirection direction){
		
		switch(direction){
		case Right:
			carDirection = carDirection.next();
			break;
		case Left:
			carDirection = carDirection.previous();
			break;
		case Forward:
			Position step = checkPosition(carDirection);
			break;
		case Backward:
			
			break;
		default:
			return;
		}
	}
	private Position checkPosition(MapDirection direction){
		switch(direction){
		case North:	return new Position(0,1);
		case East: return new Position(1,0);
		case West: return new Position(-1,0);
		case South: return new Position(0,-1);
			default:
				return null;
			
		}
	}
}
