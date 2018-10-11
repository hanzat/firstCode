package constructor;

public class ThisKeyword {

	int a = 2; //// globle value;

	public void getData() {
		int a = 3; //// local variable;
		System.out.println(a);
		/// when use this keyword it print globle variable;
		System.out.println(this.a);
		int b = a + this.a;
		System.out.println(b);
	}

	public static void main(String[] args) {

		ThisKeyword tk = new ThisKeyword();
		tk.getData();

	}

}
