
public class main {

	public static void main(String[] args) {
	
		
		Maker appl  = Apple.instance();
		
		
		CellPhone a1 = appl.whatTypeOfPhone("iPhone 11");
		System.out.println("Ordering iPhone 11");

		a1.order();
		CellPhone a2 = appl.whatTypeOfPhone("iPhone 11 Max");
		System.out.println("\n Ordering iPhone 11 Max");

		a2.order();
		
		Maker sam   = Samsung.instance();
		
		
		CellPhone s1 = sam.whatTypeOfPhone("Galaxy S10");
		System.out.println("\n Ordering Galaxy S10");

		s1.order();
		
		CellPhone s2 = sam.whatTypeOfPhone("Galaxy Note 10");
		System.out.println("\n Ordering Galaxy Note 10");

		s2.order();
	}

}
