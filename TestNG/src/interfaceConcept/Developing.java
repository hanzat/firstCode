package interfaceConcept;

public class Developing implements Bankingclient {

	public static void main(String[] args) {
// we can implements two interfaces at the same time. with "  , " comma. in one class.
/// to access the method we need to create the object first.
		Developing d = new Developing();
		d.checkingbalance();
		d.paycreditcard();
		d.transferbalance();
	}
	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
}
	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
	}
@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub

	}

}
