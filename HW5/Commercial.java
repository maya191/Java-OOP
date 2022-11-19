// Maya David 209282532
// Gaya Zaltsman 209424442
package HW5;

public class Commercial extends Asset implements Insurable{
	private char smb;
	
	public Commercial(String street, int number, int apt, int size, String ownerName, String id, int phone,char smb) {
		super(street, number, apt, size, ownerName, id, phone);
		if (smb !='S' && smb!='M' && smb !='L')
			this.smb='L';
		else
			this.smb=smb;
	}

	/**
	 * @return the smb
	 */
	public char getSmb() {
		return smb;
	}


	/**
	 * @param smb the smb to set
	 */
	public void setSmb(char smb) {
		this.smb = smb;
	}


	@Override
	public String toString() {
		return "Commercial "+super.toString()+" smb=" + smb ;
	}
	
	public double calcPropertyTax() {
		double total;
		if (smb=='S') {
			total=BasePrice*1.6*size;
		}
		else if (smb=='M') {
			total=BasePrice*2*size;
		}
		else {
			total=BasePrice*2.4*size;
		}
		return total;
	}
	
	public int calcInsurance() {
		int total;
		if (smb=='S') {
			total=(insurence+10)*size;
		}
		else if (smb=='M') {
			total=(insurence+15)*size;
		}
		else {
			total=(insurence+20)*size;
		}
		return total;
	}
	
	public double insuranceClaim(int damage ) {
		if (calcInsurance() >= damage ) {
			return 0;
		}
		else {
			return damage - calcInsurance();
		}
		
	}
	
	

}
