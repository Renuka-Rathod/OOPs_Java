package arrays;

public class TestForEachLoop {

	public static void main(String[] args) {
		 
		int[] arr= {12,24,67,4,5,6,78};
		System.out.println("Size="+arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print (arr[i] +"  ");
		}
		
		System.out.println("\n-----------");

		//for each
		//imp:foreach start with first value till last 
		//incremented by 1
		//fwdOnly
		//readOnly(using foreach loop we can not modify collection)
		for(int num:arr)
		{
			System.out.print (num+"  ");
		}
		
		
		
		
		
		
		
	}

}
