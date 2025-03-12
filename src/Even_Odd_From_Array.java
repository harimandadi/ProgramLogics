package numbers;

public class Even_Odd_From_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,3,2,6,7};

	     for(int i =0; i<a.length-1;i++){
	     if(a[i]%2==0){
	         System.out.println("Even Numbers"+a[i]);
	     }
	         if(a[i]%2!=0){
	             System.out.println("Odd Numbers"+a[i]);
	         }
	     }	
 }
}
