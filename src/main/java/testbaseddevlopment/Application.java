package testbaseddevlopment;

public class Application {

	public static void main(String[] args) {

		StringCalculator obj = new StringCalculator();

		try {
			System.out.println(obj.add("//[***]\n1***2***3"));
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}

		System.out.println(obj.getCalCallCount());

	}

}
