// Maya David 209282532
// Gaya Zaltsman 209424442
package HW5Q2;

public class Car {
	protected String carNum;
	protected double km;
	
	public Car (String carNum, double km) throws InvalidCarNumber,InvalidNegativeValue {
		
		validateCarNumber(carNum);
		this.carNum= carNum;
		validateKM(km);
		this.km=km;
	}

	/**
	 * @return the km
	 */
	public double getKm() {
		return km;
	}


	/**
	 * @param km the km to set
	 */
	public void setKm(double km) {
		this.km = km;
	}


	/**
	 * @return the carNum
	 */
	public String getCarNum() {
		return carNum;
	}
	
	public static void validateKM(double km2)throws InvalidNegativeValue {
        if (km2 < 0){
            throw new InvalidNegativeValue("mileage can't be negative number");
        }

    }

    public static void validateCarNumber(String carNumber) throws InvalidCarNumber {
        if (carNumber.matches("[0-9]+") && carNumber.length() == 7){
            
        }
        else {
            throw new InvalidCarNumber("Invalid car number");
        }


    }

	
	

}
