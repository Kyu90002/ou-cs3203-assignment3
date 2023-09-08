public class ArrayMaster {

	public static void main(String[] args) {
		int[] userArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
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
	
	public static int sum_Is(int[] userArr) {
		int sum = 0;

		for(int i = 0; i < userArr.length; i++) {
			sum += userArr[i];
		}

		return sum;
	}

	public static int product_is(int[] userArr) {
		int product = 1;

		for(int i = 0; i < userArr.length; i++) {
			product *= userArr[i];
		}

		return product;
	}

	public static int[] reverse_is(int[] userArr) {
		int[] reversed_userArr = new int[userArr.length];

		for(int i = 0; i < userArr.length; i++) {
			reversed_userArr[i] = userArr[userArr.length - 1 - i];
		}

		return reversed_userArr;
	}

	public static int[] squared_is(int[] userArr) {
		int[] squared_userArr = new int[userArr.length];

		for(int i = 0; i < userArr.length; i++) {
			squared_userArr[i] = userArr[i] * userArr[i];
		}

		return squared_userArr;
	}

}
