package firstProgram;


public class FirstProgram {

	public static void main(String[] args) {
//		AbstractChild cat= new AbstractChild();
//		cat.animalSound();
//		
//		AbstractChildDog dog =new AbstractChildDog();
//		dog.animalSound();
		
		
		IphoneInterface ip = new IphoneInterface();
		ip.battery();
		ip.color();
		ip.price();
	
}
}

