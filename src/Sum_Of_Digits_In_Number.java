package numbers;

public class Sum_Of_Digits_In_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123456;
	    int Sum = 0;

	        while (num > 0) {
	            Sum = Sum + num % 10;
	            num = num / 10;    //  1/10 produces zero
	        }
	        System.out.print("number of digits are "  + Sum);
	    }
	}

