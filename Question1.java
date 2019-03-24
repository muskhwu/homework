package www.test.homework;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

/**
 * Stage 1
 *
 */
public class Question1 {
	public static String FIZZ = "Fizz";
	public static String BUZZ = "Buzz";

	private void printer(int total) {

		for (int i = 0; i < total; i++) {
			int k = i + 1;
			String result = counter(k);
			System.out.println(result);
		}
	}

	private String counter(int number) {
		String result = "";
		if (number % 3 == 0)
			result = FIZZ;
		if (number % 5 == 0)
			result = result + BUZZ;
		if (result.equals(""))
			result = Integer.toString(number);
		return result;
	}

	public static void main(String[] args) {
		Question1 app = new Question1();
		app.printer(100);
	}

	@Test
	public void testCounter() {
		Question1 testClass = new Question1();
		Assert.assertEquals("FizzBuzz", testClass.counter(45));
	}
}
