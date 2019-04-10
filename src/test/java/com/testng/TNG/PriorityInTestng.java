package com.testng.TNG;

import org.testng.annotations.Test;

public class PriorityInTestng {
	
	
  @Test(priority=3)
  public void test1() {
	  System.out.println("Test Case 1");
  }
  
  @Test(priority=1)
  public void test2() {
	  System.out.println("Test Case 2");
  }
  
  @Test(priority=2)
  public void test3() {
	  System.out.println("Test Case 3");
  }
  
}
