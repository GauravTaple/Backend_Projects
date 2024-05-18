package com.reldyn.exception_handling.Custom;

//Custom exception but present in checked exception.....
public class Custom_Exception extends Exception {
	Custom_Exception(){
		super("You are under age");
	}
	Custom_Exception(String msg)
	{
		super(msg);
	}

}

