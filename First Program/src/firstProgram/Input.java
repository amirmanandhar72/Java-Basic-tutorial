package firstProgram;

import java.util.Scanner;

public class Input {
	Scanner scan =new Scanner(System.in);
	String name;
	int age =0;
	public void take_input() {
		System.out.println("Enter your name");
		
		name=scan.next();
		System.out.println("Enter your age");
		age=scan.nextInt();
	}
	public void show_details(){
		System.out.println("your name"+name);
		System.out.println(" your age"+age);
	
	}

}
