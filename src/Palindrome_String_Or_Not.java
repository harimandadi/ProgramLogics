package numbers;

public class Palindrome_String_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method1 : using length() and charAt function
		 String str = "ABCD";
		      String rev="";
		      int len = str.length();
		      for(int i=len-1;i>=0;i--){  
		          rev=rev+str.charAt(i);
		      }
		      System.out.print(rev);
	}

}
