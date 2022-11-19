// Maya David 209282532
// Gaya Zaltsman 209424442
package HW5;

public interface Taxable {
	int BasePrice=12;
	
	public double calcPropertyTax();
	
	public void ownershipTransfer(String name, String id, int phone);
	public void ownershipDetails();

}
