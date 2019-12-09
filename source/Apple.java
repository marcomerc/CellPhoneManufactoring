
class Apple extends Maker{	

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
