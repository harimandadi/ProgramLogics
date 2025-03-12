package numbers;

public class Sum_Of_elements_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a[] = {5,3,2,6,7};
	     int sum =0;
	     for(int i =0; i<a.length-1;i++){
	         sum = sum+a[i];
	     }
	     System.out.println("Total is  "+sum);
	    
	}

}
