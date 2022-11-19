// Maya David 209282532
// Gaya Zaltsman 209424442
package HW5;

public class Public extends Asset implements Insurable {
	private String type;
	
	public Public(String street, int number, int apt, int size, String ownerName, String id, int phone,String type) {
		super(street, number, apt, size, ownerName, id, phone);
		if (type ==null) {
			this.type="beit knesset";
		}
		else
			this.type=type;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Public"+super.toString()+" type=" + type ;
	}
	
	public double calcPropertyTax() {
		return (BasePrice+10)*size;
	}
	public int calcInsurance() {
		return publicTax*size;
	}
	
	public double insuranceClaim(int damage ) {
		if (calcInsurance() *ins >= damage ) {
			return calcInsurance()*ins;
		}
		else
			return damage;
	}
	
	
	

}
