package numbers;

public class MissingNumber_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = {1, 2, 4, 5};
         int sum1 =0, sum2=0;
         for(int i=0;i<a.length;i++){
             sum1 = sum1+a[i];
       }
         System.out.print("Sum1 values are"+sum1);
       for(int i=1;i<=5;i++){
           sum2 = sum2+i;
       }
       System.out.print("Sum1 values are "+sum2);
       System.out.print("Missing number is "+ (sum2-sum1));
		
	}

}
