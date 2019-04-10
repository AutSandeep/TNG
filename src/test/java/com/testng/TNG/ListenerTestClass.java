package com.testng.TNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenerTestClass {
	
	
	int i=0;
	 @Test
	  public void test1() {
		  System.out.println("Test Case 1");
	  }
	  
	  @Test
	  public void test2() {
		 throw new SkipException("I am Skipping");
	  }
	  
	  @Test(successPercentage=60,invocationCount=5)
	  public void test3() {
		  i++;
		  System.out.println("invocatiion count "+i);
		  if(i==1 || i==2) {
			  System.out.println("Test case failed");
			  Assert.assertEquals(i, 8);
		  }
		  
	  }

}
