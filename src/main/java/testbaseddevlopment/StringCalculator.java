package testbaseddevlopment;

import org.junit.platform.commons.util.StringUtils;

public class StringCalculator {

	/**
	 *
	 * The method can take 0, 1 or 2 numbers, and will return their sum (for an
	 * empty string it will return 0) for example “” == 0 , “1” == 1 , “1,2” ==
	 * 3
	 */
	public int add(String numbers) {

		if (StringUtils.isBlank(numbers))
			return 0;

		String numberList[] = numbers.split(",");

		int res = 0;
		for (String num : numberList) {
			res += Integer.parseInt(num);
		}
		return res;
	}

}
