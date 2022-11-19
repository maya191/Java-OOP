package HW4Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class HW4Q2 {

	public static void main(String[] args) {
		 ArrayList<Box> boxes=new ArrayList<Box> ();
		 boolean finish=false;
		 Scanner input = new Scanner(System.in);
		 int boxType;
		 
		 while(!finish) {
			 System.out.println("To add card box enter 1 , for plastic box enter 2, if you want to exit enter 0");
			 boxType =input.nextInt();
			 if (boxType ==1) {
				 System.out.println("please enter volume and max grams");
				 double vol = input.nextDouble();
				 int maxG= input.nextInt();
				 CardBox c= new CardBox(vol,maxG);
				 boxes.add(c);
			 }
			 else if (boxType==2) {
				 System.out.println("please enter volume and liquid Proof");
				 double vol = input.nextDouble();
				 boolean liq= input.nextBoolean();
				 PlasticBox p= new PlasticBox(vol,liq);
				 boxes.add(p);
			 }
			 else if (boxType ==0)
			 {
				 finish=true;		
			 }
			 else {
				 System.out.println("Error please enter valid number!");
			 }
			 
		 }
		 System.out.println("The detalis of the boxes: ");
		 for (Box b : boxes) {
			 System.out.println(b);
		 }
		 System.out.println("GoodBye!");
	}

}
