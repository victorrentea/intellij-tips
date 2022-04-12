package victor.training.intellij.refactoring.legacy;

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
            var result1 = result;
            int k1;
            k1 = x - 2;
            result1 = aaa(l, result1, k1);
            result = result1;
         } else {
            result = 3;
         }
         System.out.println("Send notification " + j);
      } else {
         result = 2;
      }
      return result;
   }

   private int aaa(int latitude, int result1, int k1) {
      for (int p = 0; p < k1; p++) {
         System.out.println("Halo " + latitude);
         latitude++;
         result1 = evenDeeper(latitude, result1, k1);
      }
      return result1;
   }

   private int evenDeeper(int l, int result, int k) {
      if (l == k) {
         result = 5;
      }
      return result;
   }

}
