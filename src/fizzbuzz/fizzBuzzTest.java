package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class fizzBuzzTest {

	@Test
	public void itKnowsThreeIsDivisibleByThree() {
		FizzBuzz test = new FizzBuzz();
		Boolean output = test.isDivisibleByThree(3);
		assertEquals(true, output);
	}
	
	public void itKnowsOneIsNotDivisibleByThree() {
		FizzBuzz test = new FizzBuzz();
		Boolean output = test.isDivisibleByThree(1);
		assertEquals(true, output);
	}
}
