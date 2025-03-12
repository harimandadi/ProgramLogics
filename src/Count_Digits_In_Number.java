package numbers;

public class Count_Digits_In_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 123433;
		   int even_count =  0;
		   int odd_count= 0 ;
		   while(num>0){
		       int rem=num%10;
		       if (rem % 2 == 0) {
		           even_count++;
		       }else{
		           odd_count++;
		       }
		       num = num/10;
		       }
		   System.out.println(even_count);
		   System.out.print(odd_count);
		 

	}

}
