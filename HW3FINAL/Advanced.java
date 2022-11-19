package HW3FINAL;

import java.util.ArrayList;

public class Advanced extends Subscriber {
	
	private ArrayList<Service> services;
	
	public Advanced(int monthlyCost, int month) {
		super(monthlyCost, month);
		services = new ArrayList<Service>();
	}
	
	@Override
	public int calcCost() {
		int baseCost = super.calcCost(); //calling to the father calcCost method for base cost
		int totalPayment = 0;
		for(Service i: services) { // go over the services list
			totalPayment += i.getServiceMonthlyCost();
		}
		totalPayment *= 12;
		
		return totalPayment + baseCost;
	}
	
	//  add payment for services only once for family subscriber.
	public int calcCostWithoutServices() {
		int base = super.calcCost();
		return base;
	}
	
	@Override
	public double calcRefund(int lastMonth) {
		double baseRefund = super.calcRefund(lastMonth); //refund for the base cost
		int servicesRefund = 0;
		for(Service i: services) { // go over the services list
			if(i.isRefundable()) {
				servicesRefund += i.getServiceMonthlyCost();
			}
		}
		servicesRefund *= super.calcMonth(lastMonth);	
		
		return baseRefund + servicesRefund; //refund of base payment + services.
	}
	
	public double calcRefundWithoutServices(int lastMonth) {
		double refund = super.calcRefund(lastMonth);
		return refund;
	}
	
	public boolean serviceExist(String serviceName) {
		for(Service i: services) { 				// go over the services list
			if(i.getServiceName().equals(serviceName)) {
				return true;
			}
		}
		return false; 				// the service doesn't exist in the services list
	}
	
	public void addService(Service s) {
		if(!serviceExist(s.getServiceName())) {
			Service newS = new Service(s); 				//making a copy of the service
			services.add(newS);									//adding a copy of the service to the array list
		}
		else {
			System.out.println("The service '"+ s.getServiceName() + "' is already purchased."); //the service is in the services list
		}
	}
	
	@Override
	public void print() {
		super.print(); 
		System.out.println("");
		System.out.println("Services list:");

		for(Service i: services) {
			System.out.println("Name: " + i.getServiceName() + ", cost: " + i.getServiceMonthlyCost() + ", is refundable: " + i.isRefundable());
		//	i.print();
		}
	}
}