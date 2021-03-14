package testbaseddevlopment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@TestInstance(Lifecycle.PER_CLASS)
public class TestStringCalculator {

	@Mock
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
		assertEquals(1, cal.add("1"));
	}

	@Test
	public void twoValStringReturnThree() {
		assertEquals(3, cal.add("1,2"));
	}

}
