// Maya David 209282532
// Gaya Zaltsman 209424442
package HW5Q2;

import java.util.ArrayList;

public class Driver {
	private String id;
	private String name;
	ArrayList <Car> cars ;
	
	
	public Driver(String name, String id) throws InvalidID,InvalidName {
		cars =new ArrayList<Car>();
		
		validateIdNumber(id);

        this.id = id;
        validateName(name);
        this.name = name;
		}

	public void addCar(Car c) {
		cars.add(c);
		
	}
	public double calculateAvarage() {
		double sum=0;
		if (cars.size()==0) {
			return 0;
		}
		for(Car c:cars) {
			sum+=c.getKm();	
		}
		return sum/cars.size();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	public static void validateIdNumber(String id) throws InvalidID {
        if (id.length() < 9){
            throw new InvalidID("Invalid ID number");
        }
    }

    public static void validateName(String name) throws InvalidName {
       char x=name.charAt(0);
    	if ((x<='Z'&& x>='A')|| (x<='z'&& x>='a')){
            
        }
    	else {
    		throw new InvalidName("Invalid name");
    	}
    }
}
