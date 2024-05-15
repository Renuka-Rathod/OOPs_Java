package pkg2;

public class Box {
	private int length, width, height;

	public Box(int length, int width, int height) {

		System.out.println("---parameter constr----");

		this.length = length;
		this.width = width;
		this.height = height;
	}

	public void display() {

		System.out.println("Box :" + this.length + "    " + this.width + "     " + this.height);
	}

	public void setLength(int l)
	{
		length=l;
	}
	public int getLength()
	{
		return length;
	}
	public boolean isSameBox(Box b2) {

		if (this.height == b2.height && this.length == b2.length && this.width == b2.width)
			return true;
		else
			return false;
	}

}
