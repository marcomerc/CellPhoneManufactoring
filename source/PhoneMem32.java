
public class PhoneMem32  extends CellPhoneDecorator{

	public PhoneMem32(CellPhone newphone) {
		super(newphone);
		
		// TODO Auto-generated constructor stub
	}
	
	
	void getPartsofPhone() {
		tempPhone.getPartsofPhone();
		System.out.println(" - 32 gigs of memory");

	}

	void buildPhone() {
		tempPhone.buildPhone();
	}

	void shipPhone() {
		tempPhone.shipPhone();
		
	}
	
}
