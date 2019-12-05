
public abstract class CellPhone {
	public final void order() {
		getPartsofPhone();
		buildPhone();
		shipPhone();
	}

	abstract void getPartsofPhone();
	abstract void buildPhone();
	abstract void shipPhone();

}
