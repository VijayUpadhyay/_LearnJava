package com.vijay.jvm;

/* Java program to demonstrate gc
 of anonymous objects */
public class AnnonymousObj {

	// to store object name
	String obj_name;

	public AnnonymousObj(String obj_name) {
		this.obj_name = obj_name;
	}

	// Driver method
	public static void main(String args[]) {
		// anonymous object without reference id
		new AnnonymousObj("t1");
		// calling garbage collector
		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		// will print name of object
		System.out.println(this.obj_name + " successfully garbage collected");
	}
}
