package in.zola.beans;

public class RestaurantService {
private IPayment payment;

public RestaurantService() {
	System.out.println("RestaurantService :: 0-param Constructor");
}

public RestaurantService(IPayment payment) {
	System.out.println("RestaurantService :: with param Constructor");
}
public void setPayment(IPayment payment) {
	System.out.println("Setter nethod called...");
	this.payment = payment;
}


public void processPayment(double amt) {
	boolean status = payment.payBills(amt);
	if (status) {
		System.out.println("Payment completed");
	}else{
		System.out.println("Payment failed...");
	}
}
}
