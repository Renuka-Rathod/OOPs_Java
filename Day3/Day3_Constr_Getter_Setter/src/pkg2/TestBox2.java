package pkg2;

public class TestBox2 {

	public static void changeLength(int len) {
		len = len + 50;
	}
	public static void changeLength(Box b) {
	int l= b.getLength();
	l=l+50;
	b.setLength(l);
	}

	public static void main(String[] args) {

		Box b1 = new Box(10, 30, 20);
		b1.display();
		// static methods get calls by class name
		// inside static we can access static directly

		changeLength(b1 );

		b1.display();//
	}

}
