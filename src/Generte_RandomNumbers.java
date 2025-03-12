package numbers;

import java.util.Random;

public class Generte_RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		int rand_int = rand.nextInt(1000);
		      System.out.println(rand_int);
		        System.out.println(rand.nextDouble());
		        System.out.println(Math.random());
		      //  String random = RandomStringUtils.randomNumeric()  after adding apache library we can generate this


	}

}
