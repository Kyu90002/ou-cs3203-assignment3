/**
 * Kyumin Lee
 * 090723
 * CS3203
 * To get to know git
 * 		commit, push, pull, branch, merge, --no-ff...
 * it was painful to figure out how to do merge without ff
 * I couldn't find a good solution from the internet
 * most of people tend to use merging with ff
 * 
 * trying to do rebase3
 */
public class ArrayMaster {

	public static void main(String[] args) {
		
		//	hard coded user array..
		int[] userArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		//	printing outputs
		System.out.print("User entered array is: ");
		for(int i = 0; i < userArr.length; i++) {
			System.out.print(userArr[i] + " ");
		}
		System.out.println();

		System.out.println("The sum of array is: " + sum_Is(userArr));
		System.out.println("The product of array is: " + product_is(userArr));
	
		System.out.print("The squared array is: ");
		for(int i = 0; i < userArr.length; i++) {
			System.out.print(squared_is(userArr)[i] + " ");
		}
		System.out.println();

		System.out.print("The reverse of array is: ");
		for(int i = 0; i < userArr.length; i++) {
			System.out.print(reverse_is(userArr)[i] + " ");
		}
		System.out.println();

	}

	// easy for loop += opr
	public static int sum_Is(int[] userArr) {
		int sum = 0;

		for(int i = 0; i < userArr.length; i++) {
			sum += userArr[i];
		}

		return sum;
	}

	// multiplies every int in the array
	public static int product_is(int[] userArr) {
		int product = 1;

		for(int i = 0; i < userArr.length; i++) {
			product *= userArr[i];
		}

		return product;
	}

	// was kinda tricky cause length is 10 (not 9) so -1 then -i.
	public static int[] reverse_is(int[] userArr) {
		int[] reversed_userArr = new int[userArr.length];

		for(int i = 0; i < userArr.length; i++) {
			reversed_userArr[i] = userArr[userArr.length - 1 - i];
		}

		return reversed_userArr;
	}

	// for some reason ^2 didn't work? turns out you gotta use Math.pow(a,b) for a^b
	public static int[] squared_is(int[] userArr) {
		int[] squared_userArr = new int[userArr.length];

		for(int i = 0; i < userArr.length; i++) {
			squared_userArr[i] = userArr[i] * userArr[i];
		}

		return squared_userArr;
	}
	

}
