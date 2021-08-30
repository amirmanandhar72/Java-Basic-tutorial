package newPackage;

import java.util.ArrayList;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> car= new ArrayList<String>();
		car.add("Ford");
		car.add("Toyota");
		car.add("Hero");
		car.add("Honda");
		
		System.out.println(car);
		
		String [] colors = new String[3];
		colors[0]="red";
		colors[1]="blue";
		colors[2]="ornage";
		for(int i=0; i<3;i++) {
			System.out.println(colors[i]);
		}
		car.add("2");
		System.out.println(car);
		
		car.get(0);
		car.set(2, "thikcha");
		car.remove(4);
		System.out.println(car);
		
	}

}
