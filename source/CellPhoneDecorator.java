
public class CellPhoneDecorator extends CellPhone {

	protected CellPhone tempPhone;
	
	public CellPhoneDecorator(CellPhone newphone) {
		tempPhone  = newphone;
	}
	
	@Override
	void getPartsofPhone() {
		tempPhone.getPartsofPhone();
		
	}

	@Override
	void buildPhone() {
		tempPhone.buildPhone();
	}

	@Override
	void shipPhone() {
		tempPhone.shipPhone();
		
	}

}
