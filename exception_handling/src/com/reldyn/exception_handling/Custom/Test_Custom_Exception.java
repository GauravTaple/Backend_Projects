package com.reldyn.exception_handling.Custom;

public class Test_Custom_Exception {
	public static void main(String[] args)  {
		int age=17;
		try {
			if(age<18)
			{
				throw new Custom_Exception("You can't Vote...!!!");
			}
			else {
				System.out.println("You can voting...!!!");
			}
		}catch(Custom_Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
		
	}
}
