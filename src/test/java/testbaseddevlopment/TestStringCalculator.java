package testbaseddevlopment;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringCalculator {

	@Mock
	private StringCalculator cal ;

	@Test
	public void emptyStringReturnTrue() {
		assertEquals(0, cal.Add(""));
	}

}
