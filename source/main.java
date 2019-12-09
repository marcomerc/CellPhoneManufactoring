
public class main {

	public static void main(String[] args) {
	
		
		Maker appl  = new Apple();
		
		CellPhone a1 = appl.whatTypeOfPhone("iPhone 11");
		a1           = new CellPhoneDecorator(a1);
		a1           = new PhoneMem32(a1);
		System.out.println("Ordering iPhone 11");
		a1.order();
		
		CellPhone a2 = appl.whatTypeOfPhone("iPhone 11 Max");
		a2           = new CellPhoneDecorator(a2);
		a2           = new PhoneMem64(a2);
		System.out.println("\n Ordering iPhone 11 Max");
		a2.order();
		
		
		
		
		Maker sam   = new Samsung();
		
		CellPhone s1 = sam.whatTypeOfPhone("Galaxy S10");
		s1           = new CellPhoneDecorator(s1);
		s1           = new PhoneMem32(s1);
		System.out.println("\n Ordering Galaxy S10");
		s1.order();
		
		CellPhone s2 = sam.whatTypeOfPhone("Galaxy Note 10");
		s2           = new CellPhoneDecorator(s2);
		s2           = new PhoneMem64(s2);
		
		
		System.out.println("\n Ordering Galaxy Note 10");

		s2.order();
	}

}
