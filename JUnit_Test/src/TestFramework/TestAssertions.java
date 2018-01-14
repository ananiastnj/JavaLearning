package TestFramework;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * All the assertions are in the Assert class
 * public class Assert extends java.lang.Object
 * 
 * Methods :
 * 1. assertEquals(boolean expected, boolean actual)
 * 2. assertTrue(boolean condition) - Check that a condition is true
 * 3. 
 * 
 */
public class TestAssertions {
	@Test
	public void testAssertions(){
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		int val1 = 5;
		int val2 = 6;
		String[] expectedArray = {"one","two"};
		String[] resultArray = {"one","two"};
		//check that two objects are equal
		assertEquals(str1, str5);
		//Check that a condition is true
		assertTrue(val1 < val2);
		//check that a condition is false
		assertFalse(val1 > val2);
		//check that an object isn't null
		assertNotNull(str1);
		//check that object is null
		assertNull(str3);
		//check if two object references point to the same object
		assertSame(str4,str5);
		//check if two object references not point to the same
		assertNotSame(str1,str3);
		//Check whether two arrays are equal to each other
		assertArrayEquals(expectedArray, resultArray);
	}
}
