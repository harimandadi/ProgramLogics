package numbers;

public class Number_Of_Digits_IN_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num = 123456;
		int count =0 ;
		while(Num>0) {
			Num = Num/10;
			count ++;
		}
		System.out.print(count);
	}
}
