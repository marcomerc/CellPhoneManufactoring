
class Apple extends Maker{
	
	private static Maker onlyApple = null;

	private  Apple() {};
	
	public static Maker instance() {
		if(onlyApple ==null) {
			onlyApple = new Apple();
		}
		return onlyApple;
		
	}
	
	
	
	
	
	@Override
	CellPhone whatTypeOfPhone(String Type) {
		if(Type == "iPhone 11") {
			return new iPhone11();
		}else if(Type == "iPhone 11 Max") {
			return new iPhone11Max();
		}
		System.out.println("iPhone not available");

		
		return null;
	}
	
	
}
