package victor.training.legacy;

public class LegacyCode {


   public int method(int x) {
      int i;
      int j = 5; // try also f(x);
      int k;
      int l = x;
      int result = 0;

      if (x > 0) {
         i = 1;
         if (x > i) {
            k = x - 2;
            for (int p = 0; p < k; p++) {
               System.out.println("Halo " + l);
               l++;
               if (l == k) {
                  result = 5;
               }
            }
         } else {
            result = 3;
            System.out.println("Send notification " + j);
         }
      } else {
         result = 2;
      }
      return result;
   }

   private int f(int x) { // is this pure ?
      return 0;
   }

}
