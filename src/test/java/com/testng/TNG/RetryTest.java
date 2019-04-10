package com.testng.TNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
	int i=0;
	
  @Test
  public void test1() {
	  System.out.println("Retrying");
	  i++;
	  if(i<3) {
		  System.out.println("Failed");
		  Assert.assertTrue(false);
	  }else {
		  System.out.println("Passed");
		  Assert.assertTrue(true);
	  }
	 
  }
}
