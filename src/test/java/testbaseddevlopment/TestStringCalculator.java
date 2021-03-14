package testbaseddevlopment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
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
	public void emptyStringReturnZero() {
		assertEquals(0, cal.add(""));
	}

	@Test
	public void oneValStringReturnOne() {
		int val = cal.add("1");
		assertEquals(1, val);
	}

	@Test
	public void twoValStringReturnThree() {
		assertEquals(3, cal.add("1,2"));
	}

	@Test
	public void handleNewLineCase() {
		assertEquals(6, cal.add("1\n2,3"));
	}

}
