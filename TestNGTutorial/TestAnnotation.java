package TestNGTutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.*;
public class TestAnnotation {
  @Test
  public void testCase1() {
	  System.out.println("I am the Test Case 1");
  }
  @Test
  public void testCase2(){
	  System.out.println("I am the Test Case 2");
  }
  @BeforeMethod
  public void beforeMethod(){
	  System.out.println("I am before method");
  }
  @AfterMethod
  public void afterMethod(){
	  System.out.println("I am after method");
  }
  @BeforeClass
  public void beforeClass(){
	  System.out.println("I am before class");
  }
  @AfterClass
  public void afterClass(){
	  System.out.println("I am after class ");
  }
  @BeforeTest
  public void beforeTest(){
	  System.out.println("I am before test");
  }
  @AfterTest
  public void afterTest(){
	  System.out.println("I am after test");
  }
  @BeforeSuite
  public void beforeSuite(){
	  System.out.println("I am before Suite");
  }
  @AfterSuite
  public void afterSuite(){
	  System.out.println("I am after Suite");
  }
}
