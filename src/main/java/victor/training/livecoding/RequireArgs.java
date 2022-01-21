package victor.training.livecoding;

import org.springframework.stereotype.Service;

//@Service
public class RequireArgs {
   private final Dep1 dep1;
   private final Dep2 dep2;

   public RequireArgs(Dep1 dep1, Dep2 dep2) {
      this.dep1 = dep1;
      this.dep2 = dep2;
   }

   public void method() {
      System.out.println("Stuff with " + dep1 + " and " + dep2);
   }
}

class Dep1 {}
class Dep2 {}
