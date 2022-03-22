package operator;

public class Variables {
	static int x=10;//static variable
	int y=5;//instance variable
	public static void main(String[] args) {
		int z=30;//local variable
		System.out.println(z);
		System.out.println(Variables.x);
		Variables v=new Variables();
		System.out.println(v.y);
	}

}
