package operator;

public class MethodOverriding {
	int a=10;
	int b=20;
	static void add(int x,int y) {
		int sum=x+y;
		System.out.println(sum);
	}
	static void add(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	static void add(double x,double y) {
		System.out.println(x*y);
	}
	static void add(double x,int y) {
		System.out.println(x*y);
	}
	static void add(int x,double y) {
		System.out.println(x*y);

}
	public static void main(String[] args) {
		add(5,10);
	}
}
