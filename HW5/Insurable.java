// Maya David 209282532
// Gaya Zaltsman 209424442
package HW5;

public interface Insurable {

	int insurence=8;
	int publicTax=22;
	double ins=0.6;
	
	public int calcInsurance();
	public double insuranceClaim(int damage );
}
