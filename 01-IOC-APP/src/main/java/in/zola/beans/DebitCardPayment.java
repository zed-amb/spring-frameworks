package in.zola.beans;

public class DebitCardPayment implements IPayment{
public DebitCardPayment() {
	System.out.println("Debit card :: Constractor");
}
	@Override
	public boolean payBills(double amnt) {
		System.out.println("Debit card patment processing");
		return true;
	}

}
