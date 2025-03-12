package numbers;

import java.util.Scanner;

public class Palindrome_Number_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number");
	        int num = sc.nextInt();
	       int rev=0;
	        int org_num=num;
	        
	        while(num!=0){
	           rev  = rev*10 + num%10;
	           num =num /10;
	       }
	       if (org_num==rev){
	           System.out.print("palindrome");
	       }
	       else {
	           System.out.print("Not palindrome");

	       }
		   
	}

}
