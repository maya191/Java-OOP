// Maya David 209282532
// Gaya Zaltsman 209424442
package HW5Q3;

import java.util.Random;
import java.util.Scanner;

public class myThread extends Thread {
	@Override
	public void run()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("please enter number N");
		int n=input.nextInt();
		Random rand = new Random();
        
		for (int i=0 ;i<n; i++) {
			int rand_int1 = rand.nextInt(n);
			int rand_int2 = rand.nextInt(n);
			if (checkSum( rand_int1)==checkSum( rand_int2)) {
				System.out.println( rand_int1+" "+ rand_int2+" are twins");
			}
			else {
				System.out.println( rand_int1+" "+ rand_int2+" are not twins");
			}
			
		}
	}
	public int checkSum(int num) {
		int sum=0;
		while (num >0) {
			sum+= num%10;
			num=num/10;
		}
		return sum;
	}

}
