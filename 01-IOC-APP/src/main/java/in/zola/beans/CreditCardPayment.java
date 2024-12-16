package in.zola.beans;

public class CreditCardPayment implements IPayment{
	public CreditCardPayment() {
		System.out.println("Credit card :: Constractor");
	}

	@Override
	public boolean payBills(double amnt) {
		// TODO Auto-generated method stub
		System.out.println("Credit card payment processing....");
		return true;
	}
	

}
