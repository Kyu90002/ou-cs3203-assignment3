public class ArrayMaster {

	public static void main(String[] args) {
		int[] userArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		System.out.println(Sum_Is(userArr));
		System.out.println(Product_Is(userArr));
	}
	
	public static int Sum_Is(int[] userArr) {
		int sum = 0;

		for(int i = 0; i < userArr.length; i++) {
			sum += userArr[i];
		}

		return sum;
	}

	public static int Product_Is(int[] userArr) {
		int product = 1;

		for(int i = 0; i < userArr.length; i++) {
			product *= userArr[i];
		}

		return product;
	}

}
