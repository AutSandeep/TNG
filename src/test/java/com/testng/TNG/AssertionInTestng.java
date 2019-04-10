package com.testng.TNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionInTestng {
	
	
  @Test
  public void test1() {
	  
	  Assert.assertTrue(true);
  }
  
  @Test
  public void test2() {
	  
	  Assert.assertTrue(false);
  }
  
  
  @Test
  public void test3() {
	  
	  Assert.assertEquals("test", "test");
  }
  
  @Test
  public void test4() {
	  
	  Assert.assertEquals("test", "test1");
  }
  
  @Test
  public void test5() {
	  
	  Assert.assertTrue(false, "not matching the expected conditions");
  }
  
  
  @Test
  public void test6() {
	  
	  Assert.assertFalse(false, "This is expected");
  }
  
  
  @Test
  public void test7() {
	  
	  Assert.assertNotEquals("test1", "test2");
  }
  
  
}
