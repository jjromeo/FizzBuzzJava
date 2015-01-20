package fizzbuzz;

public class FizzBuzz {

	public Boolean isDivisibleByThree(int i) {
		return i % 3 == 0;
	}

	public Boolean isDivisibleByFive(int i) {
		return i % 5 == 0;
	}

	public Boolean isDivisibleByFifteen(int i) {
		return i % 15 == 0;
	}

	public String fizzBuzz(int i) {
		if (this.isDivisibleByFifteen(i)) return "FizzBuzz";
		if (this.isDivisibleByThree(i)) return "Fizz";
		if (this.isDivisibleByFive(i)) return "Buzz";
		return Integer.toString	(i);
	}

}
