package HW4Q2;

public class PlasticBox extends Box {
	private  boolean liquidProof;
	private static int numPlasricBox=1;
	
	public PlasticBox( double volume, boolean liquidProof) {
		super((numPlasricBox++)*10+2, volume);
		this.liquidProof=liquidProof;
	}
	/**
	 * @return the liquidProof
	 */
	public boolean isLiquidProof() {
		return liquidProof;
	}

	@Override
	public boolean getRecyclable() {
		return false;
	}
	@Override
	public String toString() {
		return "PlasticBox"+super.toString()+" liquidProof=" + liquidProof ;
	}

}
