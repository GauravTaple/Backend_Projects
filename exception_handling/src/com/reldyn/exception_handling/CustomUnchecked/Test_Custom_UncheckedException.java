package com.reldyn.exception_handling.CustomUnchecked;

public class Test_Custom_UncheckedException {
	public static void main(String[] args) {
		int age=20;
		try {
		if(age<18)
		{
			throw new Custom_UncheckedException("You can not voting because your age below 18");
		}
		else {
			System.out.println("You are eligible for voting...");
		}
		}catch (Custom_UncheckedException e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}

}
