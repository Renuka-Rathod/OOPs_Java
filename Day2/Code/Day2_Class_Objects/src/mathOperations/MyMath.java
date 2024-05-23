package mathOperations;

public class MyMath {

	// math operations

	// access specifires
	// private:inside class only
	// default:accessible inside package only
	// protected:accessible outside package but inside sub-type
	// public:accessible everywhere

	@SuppressWarnings("unused")
	private void impFunction() {
		System.out.println("-----imp BL-----this is class specific");

	}
	//default methods
	//by default access specifier is default
	void defaultMethod()
	{
		System.out.println("This is package specific method only");
	}

	public void add() {
		System.out.println("----add()-----");
		int a = 10, b = 30;
		System.out.println("Add=" + (a + b));
	}

	public void sum(int no1, int no2) {
		int no3 = no1 + no2;
		System.out.println("Sum=" + no3);

	}

	public int max(int no1, int no2) {
		if (no1 > no2)
			return no1;
		else
			return no2;
	}

	public int min(int no1, int no2) {
		// if(no1<no2)
		// return no1;
		// else
		// return no2;

		// or
		int min = (no1 < no2 ? no1 : no2);
		return min;

	}

	public int getNumber() {
		return 100;
	}

	// prime number
	// even or odd
}
