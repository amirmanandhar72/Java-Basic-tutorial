package firstProgram;

public class Child extends Parent {
	String child="";
	public Child(String parent ,String child) {
		super(parent);
		this.child=child;
	}
	public void show_child() {
		System.out.println(child);
	}

}
