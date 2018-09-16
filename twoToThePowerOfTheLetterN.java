
public class twoToThePowerOfTheLetterN {

	public static void main(String[] args) {
		System.out.println(calculate(16));
		System.out.println(iterate(16));
		System.out.println(recurse(16));
	}

	public static int calculate(int a) {
		// https://www.youtube.com/watch?v=txWmd7QKFe8
		// Baam! Pow!
		// Pow does the power.
		return (int) Math.pow(2, a);
	}
	
	public static int iterate(int a) {
		var i = 0;
		
		// 2^0 is 1
		var returnValue = 1;
		
		for (i = 0; i < a; i++) {
			// Multiply the return value by 2
			returnValue *= 2;
		}
		
		return returnValue;
	}
	
	public static int recurse(int a) {
		// Return 1 if the power is 0
		if (a == 0) return 1;
		// Return 2 if the power is 1
		if (a == 1) return 2;
		// Do 2 x 2^(n-1)
		return 2*recurse(a - 1);
	}
}
