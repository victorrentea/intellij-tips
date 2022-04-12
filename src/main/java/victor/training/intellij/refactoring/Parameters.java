package victor.training.intellij.refactoring;

public class Parameters {

   public static void method(int x) {
      System.out.println("Stuff that needs to be parameterized");
      int data = x + 1;
      try {
         System.out.println("Logic that has to change " + data);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}

class Caller1 {
   public static void f() {
      Parameters.method(1);
   }
}

class Caller2 {
   public static void g() {
      Parameters.method(2);
   }
}
// - Refactor: Introduce Parameter
// - Refactor: Inline Parameter
// - Trick: Redefine Parameter
// - Refactor: Introduce Parameter Object (new or reuse class)
// - Refactor: Introduce Functional Parameter
// - Refactor: Change method signature (with default)
// - Trick: Alt-ENTER to add new param