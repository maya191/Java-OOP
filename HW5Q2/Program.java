// Maya David 209282532
// Gaya Zaltsman 209424442
package HW5Q2;


import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		 boolean flag = true;
		//boolean idFlag = true;
		//boolean nameFlag = true;
		//boolean carNumberFlag = true;
		//boolean kmFlag = true;
		Driver d = null;
		String id=null;
		String name = null;
		
		while (flag) {
			try {
				System.out.println("Please enter driver ID number: ");
                id = input.nextLine();
                System.out.println("Please enter driver name: ");
                name = input.nextLine();
                d=new Driver (name, id);
                flag = false;  
			}
			 catch (InvalidID e) {	
					System.out.println("invalid ID");
				} 
	          catch (InvalidName e) {
					System.out.println("invalid name");
				}
			
		}
		
		
		
		/**
		while(flag){
            try{
                if (idFlag){
                    System.out.println("Please enter driver ID number: ");
                    id = input.nextLine();
                }
                if (nameFlag){
                    System.out.println("Please enter driver name: ");
                    name = input.nextLine();
                }
                
                nameFlag = true;
                idFlag = true;
                // create new driver
                d=new Driver (name, id);
                flag = false;
            }
            
            catch (InvalidID e) {	
				System.out.println("invalid ID");
			} 
            catch (InvalidName e) {
				System.out.println("invalid name");
			}
        }
        */
		
		System.out.println("The average km of all cars is:"+d.calculateAvarage());
		boolean flag2=true;
		
		String carNum=null;
		int counter = 0;
        double km = -1;
        
		
		/**
		for (int i =0; i <4;i++) {
			flag2=true;
			System.out.println("For car #" + (i+1));
			while (flag2) {
				try{
                    if(carNumberFlag){
                        System.out.println("Please enter the car number: ");
                        carNum = input.nextLine();
                    }
                    if(kmFlag){
                        System.out.println("Please enter the car km: ");
                        km = input.nextInt();
                    }

                    carNumberFlag = true;
                    kmFlag = true;
                    // if no exception was thrown, create new car
                    d.addCar(new Car(carNum, km));
                    flag2 = false;

                    // if we create new car and the total cars created are less than 4
                    if(flag2 == false && counter<4){
                        counter = counter +1;
                    }

                }
				catch (InvalidCarNumber e){
					System.out.println("Please enter valid car number"+e);
				}
				catch(InvalidNegativeValue e) {
				System.out.println("KM most be possitive number"+e);
				}
			}
		}*/
		
		System.out.println("The average km of all cars is:"+d.calculateAvarage());
			

		
	}

}




