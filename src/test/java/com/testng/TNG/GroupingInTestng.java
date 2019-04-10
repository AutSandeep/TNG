package com.testng.TNG;

import org.testng.annotations.Test;

public class GroupingInTestng {
	
	
  @Test(groups={"sanity"})
  public void test1() {
	  
  }
  
  
  @Test(groups={"regression","sanity"})
  public void test2() {
	  
  }
  
  @Test(groups={"regression"})
  public void test3() {
	  
  }
  
  
}
