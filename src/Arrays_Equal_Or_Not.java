package numbers;

public class Arrays_Equal_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int a1[] = {1, 2, 4, 5, 7, 8, 9};
	        int a2[] = {1, 2, 4, 5, 7, 8};
	        boolean status = true;
	        if (a1.length == a2.length) {
	            for (int i = 0; i < a1.length; i++) {
	                if (a1[i] != a2[i]) {
	                    status = false;
	                }
              }
	            
	        } else {
	            status = false;
	        }
	        
	        
	        if (status == true) {
	            System.out.print("arrays are equals");
	        } else {
	            System.out.print("arrays are not equals");
	        }
			}

}
