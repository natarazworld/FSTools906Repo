package com.nt.card;

public class CardPayment {
	
	
	public   String doCardPayment(long cardNo, double amount,String gateway) {
		
		return  amount+" payment is done from cardNo::"+cardNo+ "using gateway"+gateway;
		
	}

}
