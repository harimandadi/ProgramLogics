package numbers;

public class swap_numbers_with2variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a=10; int b=20;
	       //Logic3
	        b= a+b-(a=b);
	        //Logic 2
	        a =a*b;
	        b=a/b;
	        a=a/b;
	        //Logic 1
	        a=a+b;
	        b=a-b;
	        a=a-b; 
	        System.out.println("and a values are "+a);
	        System.out.println("and b values are "+b);
	}

}
