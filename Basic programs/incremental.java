package operator;

public class incremental {
	public static void main(String[] args) {
		//unary operators
		/*int a=10;
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a++);
		System.out.println(--a);*/
		
		//arithmetic operators
		/*int a=10,b=20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);*/
		
		//relational operators
		/*int a=10,b=5;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);*/
		
		//logical operators
		int a=20,b=30,c=40;
		System.out.println(a<b && ++c>b );
		System.out.println(a++<b || ++c<b );
		System.out.println(a++<b || ++c<b++ );
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(4 | 6);
		
	}

}
