package theoryLec06;

public class InstenceVariable {
	public static String food = "I'm eating Rice";
	
	public static void main(String[] args) {
		InstenceVariable mostak = new InstenceVariable();
		InstenceVariable sadik = new InstenceVariable();
		InstenceVariable farjana = new InstenceVariable();
		InstenceVariable oishyee = new InstenceVariable();
		InstenceVariable raisa = new InstenceVariable();
		
		
		/*
		 * System.out.println(mostak.food); System.out.println(sadik.food);
		 * System.out.println(farjana.food); System.out.println(oishyee.food);
		 * System.out.println(raisa.food);
		 */
		
		mostak.food = "I'm eating Kacci";
		System.out.println(mostak.food);
		System.out.println(sadik.food);
		System.out.println(farjana.food);
		System.out.println(oishyee.food);
		System.out.println(raisa.food);
		
		sadik.food = "I'm eating Shik kabab";
		System.out.println(mostak.food);
		System.out.println(sadik.food);
		System.out.println(farjana.food);
		System.out.println(oishyee.food);
		System.out.println(raisa.food);
		
		farjana.food = "I'm eating burgar";
		System.out.println(mostak.food);
		System.out.println(sadik.food);
		System.out.println(farjana.food);
		System.out.println(oishyee.food);
		System.out.println(raisa.food);
		
		oishyee.food = "I'm eating pani puri";
		System.out.println(mostak.food);
		System.out.println(sadik.food);
		System.out.println(farjana.food);
		System.out.println(oishyee.food);
		System.out.println(raisa.food);
		
		raisa.food = "I'm eating cake";
		System.out.println(mostak.food);
		System.out.println(sadik.food);
		System.out.println(farjana.food);
		System.out.println(oishyee.food);
		System.out.println(raisa.food);
		
		
		
		
		
		
	}
}
