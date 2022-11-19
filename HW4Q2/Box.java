package HW4Q2;

public abstract class Box implements inter1{
	protected int serialNum ;
	private  double volume;

	public Box( int serialNum, double volume ) {
		this.serialNum=serialNum ;
		this.volume=volume;
	}
	
	/**
	 * @return the serialNum
	 */
	public int getSerialNum() {
		return serialNum;
	}
	/**
	 * @return the volume
	 */
	public double getVolume() {
		return volume;
	}
	public abstract boolean getRecyclable();

	@Override
	public String toString() {
		return " serialNum=" + serialNum + ", volume=" + volume ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Box)) {
			return false;
		}
		Box other = (Box) obj;
		return serialNum == other.serialNum ;
	}
	
	

}
