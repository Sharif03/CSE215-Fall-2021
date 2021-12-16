package theoryLec10_AbstractionAndInterface;

import java.util.Scanner;

public class PaymentSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Bkash b = new Bkash();
		Rocket r = new Rocket();
		VisaCard v = new VisaCard();
		MarchentCard m = new MarchentCard();
		PaymentManager p;
		
		System.out.println("Choose your payment method");
		System.out.println("Payment Menu: ");
		System.out.println("1. Bkash");
		System.out.println("2. Rocket");
		System.out.println("3. VisaCard");
		System.out.println("4. MarchentCard");
		
		System.out.print("Option: ");
		int option = input.nextInt();
		if(option == 1)
			p = new PaymentManager(b);
		else if(option == 2)
			p = new PaymentManager(r);
		else if(option ==3)
			p = new PaymentManager(v);
		else
			p = new PaymentManager(m);
		
		p.paymentAccept();
				
	}
}

interface Payment {
	void doPayment();
}
class PaymentManager{
	private Payment p;
	public PaymentManager(Payment p){
		this.p = p;
	}
	public void paymentAccept() {
		p.doPayment();
	}
}

class Bkash implements Payment{
	public void doPayment() {
		System.out.println("Payment done by Bkash");
	}
}
class Rocket implements Payment{
	public void doPayment() {
		System.out.println("Payment done by Rocket");
	}
}
class VisaCard implements Payment{
	public void doPayment() {
		System.out.println("Payment done by VisaCard");
	}
}
class MarchentCard implements Payment{
	public void doPayment() {
		System.out.println("Payment done by Marchent Card");
	}
}









