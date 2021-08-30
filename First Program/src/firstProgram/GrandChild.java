package firstProgram;

public class GrandChild extends Child{
	String grandchild="";
	public GrandChild(String parent,String child,String grandchild) {
		super(parent,child);
		this.grandchild=grandchild;
	}
	public void show_grandchild() {
		System.out.println(grandchild);
	}

}
