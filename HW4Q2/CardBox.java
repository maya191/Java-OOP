package HW4Q2;

public class CardBox extends Box {
	private  int maxGrams;
	private static int numCardBox=1;
	
	
	public CardBox( double volume, int maxGrams) {
		super((numCardBox++)*10+1, volume);
		this.maxGrams=  maxGrams;
	}
	/**
	 * @return the maxGrams
	 */
	public int getMaxGrams() {
		return maxGrams;
	}

	@Override
	public boolean getRecyclable() {
		return true;
	}

	@Override
	public String toString() {
		return "CardBox"+super.toString()+" maxGrams=" + maxGrams ;
	}
	
}
