package numbers;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Natural number >1
		//Which has only 2 factors 1 and itself
		//19  - 1 and 19
		//28 - 1,2,4,7,14,28
		
		//examples: 2,3,5,7,11,13,17 ..
		 int num = 10;
	        int count = 0;

	        //logic num>1   
			//and factors should be2 those are 1 and number itself , if more than 2 factors availble its not a prime number
			
	        if (num > 1) {
	            for (int i = 1; i <= num; i++) {
	                if (num % i == 0) {
	                    count++;
	                }
	            }
	            if(count == 2) {
	                System.out.print("Prime Number");
	            }
	            else{
	                System.out.print("Not a Prime Number");

	            }
	        }
	        System.out.print("Not a Prime Number");


	}

}
