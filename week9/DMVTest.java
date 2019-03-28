import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DMVTest {
	@Test
	void test() {
		for (int i = 1800; i <= 3000; ++i) {
			int newNum = i + 10;
			System.out.println("Testing for " + i + ", output should be " + newNum);
			assert(DMV.calculateExpirationDate(i) == i + 10): "Test passed";
		}
	}

}
