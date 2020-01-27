package equalityprinter;

public class EqualityPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printEqual(0,-2,3);
		//printEqual(1,1,1);
		//printEqual(1,2,3);
		printEqual(1,1,3);
	}

	public static void printEqual(int x, int y, int z) {

		//invalid value, all numbers are equal, neither numbers are equal or different
		if ((x < 0) || (y < 0) || (z < 0)) {
			System.out.println("Invalid Value");
		} else if ((x == y) && (x == z) && (y == x) && (y == z) && (z == y) && (z == x)) {
			System.out.println("All numbers are equal");
		} else if ((x != y) && (x != z) && (y != x) && (y != z) && (z != y) && (z != x)) {
			System.out.println("All numbers are different");
		} else {
			System.out.println("Neither numbers are equla or different");
		}
	}
}
