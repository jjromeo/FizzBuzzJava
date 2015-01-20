package fizzbuzz;

public class FizzBuzz {
	
	public Boolean isDivisibleBy(int divisor, int number) {
		return number % divisor == 0;
	}

	public String fizzBuzz(int i) {
		if (this.isDivisibleBy(15, i)) return "FizzBuzz";
		if (this.isDivisibleBy(5, i)) return "Buzz";
		if (this.isDivisibleBy(3, i)) return "Fizz";
		return Integer.toString	(i);
	}

	public static void main(String[] args) {
		FizzBuzz fizzbuzzer = new FizzBuzz();
		System.out.println(fizzbuzzer.fizzBuzz(Integer.parseInt(args[0])));
	}
}
