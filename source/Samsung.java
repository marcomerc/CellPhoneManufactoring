
public class Samsung extends Maker {
	
	private static Maker onlySamsung = null;

	private  Samsung() {};

	
	public static Maker instance() {
		if(onlySamsung ==null) {
			onlySamsung = new Samsung();
		}
		return onlySamsung;
	}
	

	
	
	@Override
	CellPhone whatTypeOfPhone(String Type) {
		if(Type == "Galaxy S10") {
			return new GalaxyS10();
		}else if(Type == "Galaxy Note 10") {
			return new GalaxyNote10();
		}
		
		System.out.println("Galaxy not available");

		
		return null;
	}

}
