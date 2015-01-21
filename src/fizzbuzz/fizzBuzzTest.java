package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class fizzBuzzTest {
	private static FizzBuzz test = new FizzBuzz();
	
	@Test
	public void itKnowsThreeIsDivisibleByThree() {
		Boolean output = test.isDivisibleBy(3, 3);
		assertEquals(true, output);
	}
	
	@Test
	public void itKnowsOneIsNotDivisibleByThree() {
		Boolean output = test.isDivisibleBy(3, 1);
		assertEquals(false, output);
	}
	
	@Test
	public void itKnowsFiveIsDivisibleByFive() {
		Boolean output = test.isDivisibleBy(5, 5);
		assertEquals(true, output);
	}
	
	@Test
	public void itKnowsOneIsNotDivisibleByFive() {
		Boolean output = test.isDivisibleBy(5, 1);
		assertEquals(false, output);
	}
	
	@Test
	public void itKnowsFifteenIsDivisibleByFifteen() {
		Boolean output = test.isDivisibleBy(15, 15);
		assertEquals(true, output);
	}
	
	@Test
	public void itKnowsOneIsNotDivisibleByFifteen() {
		Boolean output = test.isDivisibleBy(15, 1);
		assertEquals(false, output);
	}
	
	@Test
	public void itReturnsFizzForTheNumberThree() {
		String output = test.fizzBuzz(3);
		assertEquals("Fizz", output);
	}
	
	@Test
	public void itReturnsBuzzForTheNumberFive() {
		String output = test.fizzBuzz(5);
		assertEquals("Buzz", output);
	}
	
	@Test
	public void itReturnsFizzBuzzForTheNumberFifteen() {
		String output = test.fizzBuzz(15);
		assertEquals("FizzBuzz", output);
	}
}
