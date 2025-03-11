package numbers;

import java.util.Scanner;

public class RevNum_UsingStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner (System.in);
	        System.out.print("Enter a Number");
	        int num = sc.nextInt();

	        StringBuffer sb = new StringBuffer(String.valueOf(num));
	        StringBuffer rev = sb.reverse();
	        System.out.print(rev);


	        
	     /*   Using String Builder
	        //Using String buffer class
	         Scanner sc = new Scanner (System.in);
	         System.out.print("Enter a Number");
	         int num = sc.nextInt();

	         StringBuilder sb = new StringBuilder();
	        sb.append(num);
	        StringBuilder rev = sb.reverse();		*/

	}

}
