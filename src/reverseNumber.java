package numbers;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner (System.in)   
			     Scanner sc = new Scanner(System.in);
			     System.out.print("Enter a Number");
			     int num= sc.nextInt();
			     int rev=0;
			     //using algorithm 
			        while(num!=0){
			            rev=rev*10 + num%10;   //0+1234%10 =4   40+3 =43   430+2=432   4320+1  (1 digit %10 gives 1)
			            num = num/10;  //1234/10 =123    123/10 =12        12/10 =1     1/10 =0
			        }
			       System.out.print(rev);

	}

}
