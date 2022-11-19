// Maya David 209282532
// Gaya Zaltsman 209424442
package HW5;

public class Residential extends Asset {
	private int householdSize;
	
	
	public Residential(String street, int number, int apt, int size, String ownerName, String id, int phone, int householdSize) {
		super(street, number, apt, size, ownerName, id, phone);
		this.householdSize=  householdSize;
	}

	
	/**
	 * @return the householdSize
	 */
	public int getHouseholdSize() {
		return householdSize;
	}


	/**
	 * @param householdSize the householdSize to set
	 */
	public void setHouseholdSize(int householdSize) {
		this.householdSize = householdSize;
	}


	@Override
	public String toString() {
		return "Residential"+super.toString()+ " householdSize=" + householdSize ;
	}
	
	public double calcPropertyTax() {
		double total= BasePrice*size;
		if (householdSize >=6) {
			return total*0.85;
		}
		else
			return total;
	}
	

}
