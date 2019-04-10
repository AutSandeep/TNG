package com.testng.TNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependnsOnMethods {
	
  @Test
  public void test1() {
	  Assert.assertTrue(true);
  }
  
  @Test(dependsOnMethods={"test1"})
  public void test2() {
	  System.out.println("Test2 passed");
  }
  
  
  @Test(dependsOnMethods={"test1","test2"})
  public void test3() {
	  System.out.println("Test3 passed");
  }
  
  
  @Test
  public void test4() {
	  Assert.assertTrue(false);
  }
  
  @Test(dependsOnMethods={"test4"})
  public void test5() {
	  System.out.println("Test5 passed");
  }
  
}
