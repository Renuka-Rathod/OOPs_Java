package pkg2;

public class TestBox {

	public static void main(String[] args) {
		
		
		Box box1=new Box(12, 34, 56);
		box1.display();
		
		
		Box box2=new Box(12, 34, 56);
		box2.display();
		
		boolean status=box1.isSameBox(box2);
		if(status)
			System.out.println("Box1=Box2");
		else
			System.out.println("Box1!=Box2");
		
	}
}
