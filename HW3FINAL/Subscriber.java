package HW3FINAL;

public class Subscriber {
	private int monthlyCost;
	private int month;
	
	public Subscriber(int monthlyCost, int month) {
		this.monthlyCost = monthlyCost;
		this.month = month;
	}

	public int getMonthlyCost() {
		return monthlyCost;
	}

	public void setMonthlyCost(int monthlyCost) {
		if(monthlyCost >= 100) {
			this.monthlyCost = monthlyCost;
		}
		else {
			monthlyCost = 100;
			System.out.println("You insert invalid value.");
		}
	}

	public int getMonth() {
		return month;
	}
	
	public int calcCost() {
		return (monthlyCost * 12);
	}
	
	public int calcMonth(int lastMonth) { // this method is calculate the number of month for refund
		int monthAmount = 0;
		if(month < lastMonth) {
			monthAmount = (12 - lastMonth + month - 1); 
		}
		else {
			monthAmount = (month - lastMonth - 1);
		}
		return monthAmount;
	}
	
	public double calcRefund(int lastMonth) {
		double refund = (calcMonth(lastMonth) * monthlyCost); // calculate how many money to refund
		return refund;		
	}
	
	public void print() {
		System.out.println("monthlyCost:" + monthlyCost + ", month:" + month);
	}

}
