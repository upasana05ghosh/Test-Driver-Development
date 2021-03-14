package testbaseddevlopment;

public class StringCalculator {

	/**
	 *
	 * The method can take 0, 1 or 2 numbers, and will return their sum (for an
	 * empty string it will return 0) for example “” == 0 , “1” == 1 , “1,2” ==
	 * 3
	 */
	public int add(String numbers) {

		if (numbers == null || numbers.trim().isEmpty())
			return 0;

		String numberList[] = numbers.replaceAll("\n", ",").split(",");

		int res = 0;
		for (String num : numberList) {
			res += Integer.parseInt(num);
		}
		return res;
	}

}
