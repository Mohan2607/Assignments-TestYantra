package operator;

public class ControlStatement {
	/*public static void main(String[] args) {
		//decision making
		if(true)
		{
			System.out.println("Hello all");
		}
		int x=20,y=10;
		if(x>y)
		{
			System.out.println("welcome");
		}
	}*/
	
	
	//if else
	/*public static void main(String[] args) {
		int money=1000;
		if(money>900)
		{
			System.out.println("lets go to Goa");
		}else {
			System.out.println("lets go to chickmanglur");
		}
	}*/
	
	//ladder if
	public static void main(String[] args) {
		int money=11500;
		if(money>11000 && money<9000){
			System.out.println("lets go to goa");
			
		}else if(money<9000){
			System.out.println("lets go to delhi");
		}else if(money>12000){
			System.out.println("lets go to chennai");
		}
		else{
			System.out.println("lets go to banglore");
		}
	}

}
