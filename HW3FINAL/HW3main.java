package HW3FINAL;

public class HW3main {

	public static void main(String[] args) {
		// Q1
		System.out.println("Q1: ");
		Subscriber b1=new Subscriber(200,5);
		System.out.println("The yearly cost is: "+ b1.calcCost());
		System.out.println("The refund is: "+ b1.calcRefund(2));
		b1.print();
		
		//Q2
		System.out.println("Q2: ");
		Service pool= new Service("pool", 50, false);
		Service locker= new Service("locker", 10, true);
		Service playroom= new Service("playroom", 25, true);
		
		//Q3
		System.out.println("Q3: ");
		Advanced ad1 = new Advanced(160,2);
		ad1.addService(pool);
		ad1.addService(locker);
		System.out.println("The yearly cost is: "+ad1.calcCost());
		ad1.print();
		
		//Q4
		System.out.println("Q4: ");
		Advanced ad2 = new Advanced(180 ,2);
		ad2.addService(pool);
		System.out.println("The yearly cost is: "+ad2.calcCost());
		if (ad2.serviceExist("spinning")) {
			System.out.println("The service spinning is exist");
		}
		else
			System.out.println("The service spinning is not exist");
		ad2.addService(pool);
		
		//Q5
		System.out.println("Q5: ");
		Family fam1 = new Family(190,11, 3,2);
		fam1.addService(pool);
		fam1.addService(playroom);
		System.out.println("The yearly cost is: "+fam1.calcCost());
		System.out.println("The refund is: "+ fam1.calcRefund(3));
		fam1.print();
		
	}

}
