// Maya David 209282532
// Gaya Zaltsman 209424442
package HW5;

import java.util.ArrayList;
import java.util.Random;

public class HW5Q1 {

	public static void main(String[] args) {
		ArrayList<Asset> assets=new ArrayList<Asset>();
		ArrayList<Taxable> taxAssets=new ArrayList<Taxable>();
		ArrayList<Insurable> insAssets=new ArrayList<Insurable>();
		
		Residential r = new Residential("sici",12,4,100,"maya","209282532",0544274422,5);
		Commercial c=new Commercial("didi",212,8,300,"maya","209282532",0544274422,'M');
		Public p=new Public("gan",7,12,127,"maya","209282532",0544274422,"matnas");
		
		assets.add(r);
		assets.add(c);
		assets.add(p);
		
		taxAssets.add(r);
		taxAssets.add(c);
		taxAssets.add(p);
		
		insAssets.add(c);
		insAssets.add(p);
		
		
		for (Asset a:assets) {
			System.out.println(a);
			a.ownershipDetails();
		}
		
		for(Taxable t:taxAssets) {
			System.out.println("The tax is: "+t.calcPropertyTax());
		}
		totlalClaims( insAssets);
		
	}
	public static void totlalClaims(ArrayList<Insurable> insAssets) {
		Random rand = new Random();
		int randomNum = rand.nextInt((100000 - 1000) + 1) + 1000;
		for (Insurable i :insAssets) {
			System.out.println("the sum for payment:"+i.insuranceClaim(randomNum));
		}
		
	}

}
