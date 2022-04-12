package victor.training.intellij.refactoring;

import org.junit.jupiter.api.Test;

public class Fields {
   @Test
   public void test1() {
      new TestedClass().f("a");
   }
   @Test
   public void test2() {
      new TestedClass().f("b");
   }

}
class TestedClass {
   public void f(String a) {
      String x = a.toUpperCase();
      System.out.println(x);
   }
}
// - extract field (Yuck: long-lived state, temporary field code smell)
// - inline field