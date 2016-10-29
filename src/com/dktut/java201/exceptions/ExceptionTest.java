package com.dktut.java201.exceptions;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			a();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void a() throws Exception {
		b();
	}
	
	private static void b() throws Exception {
		c();
	}
	
	private static void c() throws Exception {
		throw new Exception("ouch");
	}
}


