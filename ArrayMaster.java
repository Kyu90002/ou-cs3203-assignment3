public class ArrayMaster {
    
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
