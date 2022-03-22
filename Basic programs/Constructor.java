package operator;

public class Constructor {
	/*
	//default constructor
	 Constructor() {
		 System.out.println("hiii from constructor");
	}
	 public static void main(String[] args) {
		Constructor con=new Constructor();
	}*/
	Constructor(){
		System.out.println("hii am from constructor");
	}
	public static void main(String[] args) {
		Constructor con= new Constructor();
		MethodOverriding.add(12,12);
		
		MethodOverriding a= new MethodOverriding();
		a.add(13,12);
		System.out.println("the value of b is "+a.b);
		}

}
