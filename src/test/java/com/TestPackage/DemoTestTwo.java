package com.TestPackage;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTestTwo {
	@Test
	public void  sum() {
		System.out.println("sum Class 22222");
		int a = 10;
		int b = 30;
		int x;
		Assert.assertEquals(40, a+b);
	}
	
	@Test
	public void  sub() {
		System.out.println("subtract");

		int a = 10;
		int b = 30;
		Assert.assertEquals(20, b-a);
	}
	@Test
	public void  div() {
		System.out.println("division");

		int a = 10;
		int b = 30;
		Assert.assertEquals(3, b/a);
	}
	
	@Test
	public void  multi() {
		System.out.println("multiply");

		int a = 10;
		int b = 30;
		Assert.assertEquals(300, a*b);
	}


}
