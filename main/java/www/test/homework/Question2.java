package www.test.homework;

/**
 * Stage 2
 *
 */
public class Question2 {
	public static String FIZZ = "Fizz";
	public static String BUZZ = "Buzz";

	public void counter(int total) {

		for (int i = 0; i < total; i++) {
			int k = i + 1;
			String result = "";
			if (k % 3 == 0 || Integer.toString(k).contains("3"))
				result = FIZZ;
			if (k % 5 == 0|| Integer.toString(k).contains("5"))
				result = result + BUZZ;
			if (result.equals(""))
				result = Integer.toString(k);
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		Question1 app = new Question1();
		app.counter(100);
	}
}
