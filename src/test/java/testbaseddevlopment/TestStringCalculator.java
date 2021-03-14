package testbaseddevlopment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

@TestInstance(Lifecycle.PER_CLASS)
public class TestStringCalculator {

	@InjectMocks
	private StringCalculator cal;

	@BeforeAll
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void emptyStringReturnZero() throws NegativeNumberException {
		assertEquals(0, cal.add(""));
	}

	@Test
	public void oneValStringReturnOne() throws NegativeNumberException {
		int val = cal.add("1");
		assertEquals(1, val);
	}

	@Test
	public void twoValStringReturnThree() throws NegativeNumberException {
		assertEquals(3, cal.add("1,2"));
	}

	@Test
	public void handleNewLineCase() throws NegativeNumberException {
		assertEquals(6, cal.add("1\n2,3"));
	}

	@Test
	@DisplayName("handle Different Dilimiter")
	public void handleDifferentDilimiter() throws NegativeNumberException {
		assertEquals(3, cal.add("//;\n1;2"));
	}

	@Test
	public void testNegativeNumber() {
		NegativeNumberException thrown = assertThrows(NegativeNumberException.class, () -> cal.add("-1;-2"),
				"Expected cal() to throw negative number exception, but it didn't");
		System.out.println(thrown.getMessage());
		assertTrue(thrown.getMessage().contains("negatives"));
	}

	@Test
	public void ignoreNumberBiggerThanThousand() throws NegativeNumberException {
		assertEquals(2, cal.add("2;1001"));
	}

	@AfterAll
	public void checkCalCount() {
		assertTrue( 0 < cal.getCalCallCount());
	}

}
