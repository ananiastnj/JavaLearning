package TestNGSimpleTest;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void function_name() {
	  String str = "TestNG is working fine";
	  assertEquals("TestNG is working fine", str);
  }
}

