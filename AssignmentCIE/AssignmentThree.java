interface PaymentMethod{
	void payment(double amount);
}

class CreditCardPayment implements PaymentMethod{
	public void payment(double amount){
		System.out.println("Using Credit Card for paying");
	}
}

class PaypalPayment implements PaymentMethod{
	public void payment(double amount){
		System.out.println("Using Paypal for paying ");
	}
}

class GooglePayPayment implements PaymentMethod{
	public void payment(double amount){
		System.out.println("Using Google Pay for paying");
	}
}	

class PaymentSoftware{		
	
	public void transaction(PaymentMethod paymentMethod, double amount){
		paymentMethod.payment(amount);
	}
}

public class AssignmentThree{
	public static void main(String[] args){
		
		PaymentMethod creditCardPayment = new CreditCardPayment();
		PaymentMethod paypalPayment = new PaypalPayment();
		PaymentMethod googlePayPayment = new GooglePayPayment();
		PaymentSoftware paymentSoftware = new PaymentSoftware();
		paymentSoftware.transaction(creditCardPayment, 3000.00);
		paymentSoftware.transaction(paypalPayment, 4000.00);
		paymentSoftware.transaction(googlePayPayment, 5000.00);
	}
}
