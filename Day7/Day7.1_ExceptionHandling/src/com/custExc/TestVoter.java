package com.custExc;

public class TestVoter {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("-----Voter--");
		Voter voterObj ;
		voterObj=new Voter(202, "Ram", 2);//
		voterObj.fun1();
		
		
		try {
			voterObj.isValidAge();
		} catch (VoterException e) {
			// TODO Auto-generated catch block
			 System.err.println(e.getMessage());
		}//chked excep
		
		
	}

}
