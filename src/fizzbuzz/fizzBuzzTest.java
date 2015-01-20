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
	
	@Test
	public void itKnowsOneIsNotDivisibleByThree() {
		FizzBuzz test = new FizzBuzz();
		Boolean output = test.isDivisibleByThree(1);
		assertEquals(false, output);
	}
	
	@Test
	public void itKnowsFiveIsDivisibleByFive() {
		FizzBuzz test = new FizzBuzz();
		Boolean output = test.isDivisibleByFive(5);
		assertEquals(true, output);
	}
	
	@Test
	public void itKnowsOneIsNotDivisibleByFive() {
		FizzBuzz test = new FizzBuzz();
		Boolean output = test.isDivisibleByFive(1);
		assertEquals(false, output);
	}
	
	@Test
	public void itKnowsFifteenIsDivisibleByFifteen() {
		FizzBuzz test = new FizzBuzz();
		Boolean output = test.isDivisibleByFifteen(15);
		assertEquals(true, output);
	}
	
	@Test
	public void itKnowsOneIsNotDivisibleByFifteen() {
		FizzBuzz test = new FizzBuzz();
		Boolean output = test.isDivisibleByFifteen(1);
		assertEquals(false, output);
	}
	
	@Test
	public void itReturnsFizzForTheNumberThree() {
		FizzBuzz test = new FizzBuzz();
		String output = test.fizzBuzz(3);
		assertEquals("Fizz", output);
	}
	
	@Test
	public void itReturnsBuzzForTheNumberFive() {
		FizzBuzz test = new FizzBuzz();
		String output = test.fizzBuzz(5);
		assertEquals("Buzz", output);
	}
	
	@Test
	public void itReturnsFizzBuzzForTheNumberFifteen() {
		FizzBuzz test = new FizzBuzz();
		String output = test.fizzBuzz(15);
		assertEquals("FizzBuzz", output);
	}
}
