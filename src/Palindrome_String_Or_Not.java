package numbers;

public class Palindrome_String_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method1 : using length() and charAt function
		 String str = "ABCD";
	      String rev="";
		  String org_str = str;
	      int len = str.length();
	      for(int i=len-1;i>=0;i--){  //3  2 1 0  -1
	          rev=rev+str.charAt(i);
	      }
	      System.out.print(rev);
		  if(org_str.equals(rev)){
		  System.out.print("palindrome String");
		   }
		   else{
		   System.out.print("Not palindrome sTring");
		   }

	}

}
