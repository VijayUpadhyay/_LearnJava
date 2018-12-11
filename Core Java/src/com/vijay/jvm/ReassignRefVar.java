package com.vijay.jvm;

/* Java program to demonstrate gc
when one object referred to other object */
public class ReassignRefVar {

	// to store object name
	String obj_name;

	public ReassignRefVar(String obj_name) {
		this.obj_name = obj_name;
	}

	// Driver method
	public static void main(String args[]) {
		ReassignRefVar t1 = new ReassignRefVar("t1");
		ReassignRefVar t2 = new ReassignRefVar("t2");

		// t1 now referred to t2
		t1 = t2;

		// calling garbage collector
		System.gc();
	}

	@Override
	/*
	 * Overriding finalize method to check which object is garbage collected
	 */
	protected void finalize() throws Throwable {
		// will print name of object
		System.out.println(this.obj_name + " successfully garbage collected");
	}
}
