
public class PhoneMem64 extends CellPhoneDecorator {

	public PhoneMem64(CellPhone newphone) {
		super(newphone);
	}
	
	
	void getPartsofPhone() {
		tempPhone.getPartsofPhone();
		System.out.println(" - 64 gigs of memory");

	}

	void buildPhone() {
		tempPhone.buildPhone();
	}

	void shipPhone() {
		tempPhone.shipPhone();
		
	}
	

}
