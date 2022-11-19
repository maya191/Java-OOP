// Maya David 209282532
// Gaya Zaltsman 209424442
package HW5;

import java.util.Objects;

public abstract class Asset implements Taxable{
	
	protected String street;
	protected int number;
	protected int apt;
	protected int size;
	
	protected String ownerName;
	protected String id;
	protected int phone;
	

	public Asset(String street, int number, int apt, int size, String ownerName, String id, int phone) {

		if (street ==null) {
			this.street="unknow street";
		}
		else
			this.street = street;
		
		if (number <1) {
			this.number=1;
		}
		else
			this.number = number;
		
		if (apt <1) {
			this.apt=1;
		}
		else
			this.apt = apt;
		
		if (size <1) {
			this.size=1;
		}
		else
			this.size = size;
		
		if (ownerName==null) {
			this.ownerName="Maya";
		}
		else
			this.ownerName = ownerName;
		if (id.length()<9) {
			this.id="123456789";
		}
		else
			this.id = id;
		
		this.phone = phone;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @return the apt
	 */
	public int getApt() {
		return apt;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Asset)) {
			return false;
		}
		Asset other = (Asset) obj;
		return apt == other.apt && number == other.number && Objects.equals(street, other.street);
	}

	@Override
	public String toString() {
		return " street=" + street + ", number=" + number + ", apt=" + apt + ", size=" + size;
	}
	
	public abstract double calcPropertyTax();
	
	public void ownershipTransfer(String name, String id, int phone) {
		this.ownerName=name;
		this.id=id;
		this.phone=phone;
	}
	public void ownershipDetails() {
		System.out.println("owner name: "+ownerName+" ID:"+id+" Phone:"+phone);
	}

}
