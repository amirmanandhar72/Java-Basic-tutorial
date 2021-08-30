package firstProgram;

public class Constructor {
	String name;
	int age;
	public Constructor(String name, int age){
		 this.name = name;
		 this.age = age;
		
	}
	public void show_details() {
		System.out.println("name is"+name);
		System.out.println("age is "+ age);
	}
}
