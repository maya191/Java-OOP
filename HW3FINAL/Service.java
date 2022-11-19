package HW3FINAL;

public class Service {
	private String serviceName;
	private int serviceMonthlyCost;
	private boolean refundable;
	
	public Service(String serviceName, int serviceMonthlyCost, boolean refundable) {
		this.serviceName = serviceName;
		this.serviceMonthlyCost = serviceMonthlyCost;
		this.refundable = refundable;
	}
	
	public Service(String serviceName, int serviceMonthlyCost) {
		this.serviceName = serviceName;
		this.serviceMonthlyCost = serviceMonthlyCost;
		refundable = false;	
	}
	
	public Service(String serviceName) {
		this.serviceName = serviceName;
		serviceMonthlyCost = 10;
		refundable = false;	
	}
	
	public Service(Service other) {
		serviceName = other.serviceName;
		serviceMonthlyCost = other.serviceMonthlyCost;
		refundable = other.refundable;	
	}
	
	public String getServiceName() {
		return serviceName;
	}
	
	public int getServiceMonthlyCost() {
		return serviceMonthlyCost;
	}

	public void setServiceMonthlyCost(int serviceMonthlyCost) {
		if(serviceMonthlyCost >= 10) {
			this.serviceMonthlyCost = serviceMonthlyCost;
		}
		else {
			serviceMonthlyCost = 10;
			System.out.println("You insert invalid value.");
		}
	}

	public boolean isRefundable() {
		return refundable;
	}
	
	public void print() {
		System.out.println("  serviceName: " + serviceName + ", serviceMonthlyCost: " + serviceMonthlyCost + ", refundable: " + refundable);
	}
	
}
