package com.brijframework.production.util;

public class CommanUtil {

	private static final long LIMIT = 10000000000L;
	private static long last = 0;

	public static long getID() {
	  // 10 digits.
	  long id = System.currentTimeMillis() % LIMIT;
	  if ( id <= last ) {
	    id = (last + 1) % LIMIT;
	  }
	  return last = id;
	}

	public static String getIdenNo(String prefix) {
		return String.format(prefix+"#%010d",getID());
	}
	
	
	public static void main(String[] args) {
		System.out.println(getIdenNo("PO"));
		System.out.println(getIdenNo("PO"));
		System.out.println(getIdenNo("PO"));
		System.out.println(getIdenNo("PO"));
		System.out.println(getIdenNo("PO"));
	}
}
