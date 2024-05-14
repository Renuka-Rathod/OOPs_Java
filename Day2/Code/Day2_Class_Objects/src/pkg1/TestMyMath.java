package pkg1;
import mathOperations.MyMath;
public class TestMyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyMath obj=new MyMath();
		obj.add();
		obj.sum(367, 24);
		
		//functions need to be called explicitly
		
		System.out.println(obj.getNumber());
		
		System.out.println(obj.max(99, 8));
		
		
	}

}
