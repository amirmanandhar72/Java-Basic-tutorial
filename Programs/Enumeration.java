// Enumeration is the list of the constant variables 
//syntax is same as the class syntax enum enum-name 

public class Enumeration{
	enum Direction {
		East,West,North,South
	}
	public static void main(String[] args){
		Direction direction;//direction is the variable whereas Direction is the enumeration.
		direction=Direction.West;
		System.out.println(direction);
	}
	
}