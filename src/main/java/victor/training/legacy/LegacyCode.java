package victor.training.legacy;

public class LegacyCode {


   public int deepMethod(int x) {
      int i;
      int j = 5;
      int k;
      int l = x;
      int result = 0;

      if (x > 0) {
         i = 1;
         if (x > i) {
            result = subFunction(x, l, result);
         } else {
            result = 3;
         }
         System.out.println("Send notification " + j);
      } else {
         result = 2;
      }
      return result;
   }

   private int subFunction(int x, int l, int result) {
      int k;
      k = x - 2;
      for (int p = 0; p < k; p++) {
         System.out.println("Halo " + l);
         l++;
         result = evenDeeper(l, result, k);
      }
      return result;
   }

   private int evenDeeper(int l, int result, int k) {
      if (l == k) {
         result = 5;
      }
      return result;
   }

}
