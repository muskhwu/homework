package www.test.homework;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

/**
 * Stage 2
 *
 */
public class Qusetion2 {
	public static String FIZZ = "Fizz";
	public static String BUZZ = "Buzz";
	
	private void printer(int total) {

		for (int i = 0; i < total; i++) {
			int k = i + 1;
			String result = counter(k);
			System.out.println(result);
		}
	}

	public String counter(int number) {
			String result = "";
			if (number % 3 == 0 || Integer.toString(number).contains("3"))
				result = FIZZ;
			if (number % 5 == 0 || Integer.toString(number).contains("5"))
				result = result + BUZZ;
			if (result.equals(""))
				result = Integer.toString(number);
			return result;
		}
	
	public static void main(String[] args) {
		Qusetion2 app = new Qusetion2();
		app.printer(100);
	}

	@Test
	public void testCounter() {
		Qusetion2 testClass = new Qusetion2();
		Assert.assertEquals("FizzBuzz", testClass.counter(35));
	}
}
