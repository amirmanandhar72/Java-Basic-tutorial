public class FinalKeyword{
	public static void main(String[] args){
		final double PI= 3.14; // use of final the value of PI is always constant
		double radius =5;
		double area;
		// PI=34.44; gives error.
		area =PI* radius;
		System.out.println(PI);
		System.out.println("the area of circle is " +area);

	}
}	