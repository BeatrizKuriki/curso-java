package services;

public class PaypalService implements OnlinePaymentService{
	
	private static final Double PAYMENT_FEE = 0.02;
	private  static final Double MONTHLY_INTEREST = 0.01;

	@Override
	public Double paymentFee(Double amount) {	
		
		return amount * PAYMENT_FEE;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		
		return amount * months * MONTHLY_INTEREST;
	}
	

}
