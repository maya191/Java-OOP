package HW3FINAL;

public class Family extends Advanced {
	private int adults;
	private int kids;
	
	public Family(int monthlyCost, int month, int adults, int kids) {
		super(monthlyCost, month);
		this.adults = adults;
		this.kids = kids;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		if(adults > 0) {
			this.adults = adults;
		}
		else {
			this.adults = 1;
			System.out.println("You insert invalid value of adults");
		}
	}

	public int getKids() {
		return kids;
	}

	public void setKids(int kids) {
		if(adults >= 0) {
			this.kids = kids;
		}
		else {
			this.kids = 0;
			System.out.println("You insert invalid value of kids");
		}
	}
	
	@Override
	public int calcCost() {
		int baseCost = super.calcCostWithoutServices(); 					//calling to the father calcCost method for base cost
		int totalPayment = super.calcCost();									 //adding once the payment for services.
		
		if(adults > 1) { 											//add the first adult with the services payment.
			for(int i = 1; i < adults; i++) {
				totalPayment += baseCost * 0.8; 				//adding price with discount for every adult
			}
		}
		if(kids > 0) {
			for(int i = 0; i < kids; i++) {
				totalPayment += baseCost * 0.6; 						//adding price with discount for every kid
			}
		}
		return totalPayment;
	}
	
	@Override
	public double calcRefund(int lastMonth) {
		double baseRefund = super.calcRefund(lastMonth); 				//refund of the base + services
		double refundWithoutServices = super.calcRefundWithoutServices(lastMonth);
		
		if(adults > 1) { 					//	add the first adult with the base refund
			baseRefund += refundWithoutServices * 0.75;
			for(int i = 0; i < (adults -2); i++) { 		//loop without 2 adults.
				baseRefund += refundWithoutServices * 0.5; 
			}
		}
		
		if(kids > 0) { 						//	 add the first adult with the base refund
			for(int i = 0; i < kids; i++) { //loop without 2 adults.
				baseRefund += refundWithoutServices * 0.5; 
			}
		}

		return baseRefund;
	}
	
	@Override
	public void print() {
		super.print(); 
		System.out.println("adults: " + adults + ", kids: " + kids);
	}
	
	

}
