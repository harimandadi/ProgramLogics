package numbers;

public class factorial_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int factorial = 1;
         int num =5;
         for(int i=1;i<=num;i++){
             factorial = factorial*i;
         }
         System.out.print("Fact of number is" +factorial);
}

}
