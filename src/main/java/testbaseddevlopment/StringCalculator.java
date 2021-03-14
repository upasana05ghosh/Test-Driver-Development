package testbaseddevlopment;

import java.util.ArrayList;
import java.util.List;


public class StringCalculator {

	/**
	 *
	 * The method can take 0, 1 or 2 numbers, and will return their sum (for an
	 * empty string it will return 0) for example “” == 0 , “1” == 1 , “1,2” ==
	 * 3
	 *
	 * @throws NegativeNumberException
	 */
	public int add(String numbers) throws NegativeNumberException {

		if (numbers == null || numbers.trim().isEmpty())
			return 0;

		// remove '\n' and '//'
		// split on ',' or ';'
		String numberList[] = numbers.replaceAll("[\n//]+", ",").split(",|;");

		int res = 0;
		List<String> negativeNum = new ArrayList<>();
		for (String num : numberList) {

			if (num.contains("-")) {
				negativeNum.add(num);
			} else if (!num.trim().isEmpty())
				res += Integer.parseInt(num);
		}

		if (!negativeNum.isEmpty()) {
			throw new NegativeNumberException("negatives not allowed" + negativeNum);
		}
		return res;
	}

}
