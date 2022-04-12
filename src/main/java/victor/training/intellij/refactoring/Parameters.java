package victor.training.intellij.refactoring;

public class Parameters {

   public static void method(int w, int devs) {
      System.out.println("Status report for project Colibri");
      int days = w * 5; // work days per week
      int md = days * (devs - 1);
      try {
         System.out.println("Inner logic that has to change " + md);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}

class Caller1 {
   public static void f() {
      Parameters.method(5, 4);
   }
}

class Caller2 {
   public static void g() {
      Parameters.method(12, 3);
   }
}

