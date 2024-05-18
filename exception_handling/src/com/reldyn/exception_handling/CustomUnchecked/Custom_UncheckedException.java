package com.reldyn.exception_handling.CustomUnchecked;

////Custom exception but present in Un checked exception.....
public class Custom_UncheckedException extends RuntimeException{
	public Custom_UncheckedException() {
		super("You are not voting");
	}
	Custom_UncheckedException(String msg)
	{
		super(msg);
	}
	

}
