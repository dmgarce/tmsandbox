package nz.co.tmsandbox.api.utils;


import org.junit.Assert;

public class AssertUtil {
	
	public static void assertTrue(String expected, String actual) {
		String failMessage = "Expected string: '" + expected + "' not equal to actual: '" + actual +"'";
		Assert.assertTrue(failMessage, expected.equals(actual));
	}
	
	public static void assertTrue(boolean actual) {
		String failMessage = "Actual condition value is not true";
		Assert.assertTrue(failMessage, actual);
	}

}
