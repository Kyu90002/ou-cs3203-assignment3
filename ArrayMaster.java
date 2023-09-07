//trying to do non-FF merge

public class ArrayMaster {

	public static void main(String[] args) {
		int[] userArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		System.out.println(sum_is(userArr));
		System.out.println(product_is(userArr));
		for(int i = 0; i < userArr.length; i++) {		// for loop to print array elements
			System.out.print(reverse_is(userArr)[i] + " ");
		}

	}
	
	public static int sum_is(int[] userArr) {
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
		int[] reversedArr = new int[userArr.length];

		for(int i = 0; i < userArr.length; i++) {
			reversedArr[i] = userArr[userArr.length - 1 - i];
		}

		return reversedArr;
	}
}
