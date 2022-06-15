package victor.training.intellij.refactoring;

import lombok.RequiredArgsConstructor;

interface SomeRepo {
   int findById(int id);
}
@RequiredArgsConstructor
public class Parameters {
   private final SomeRepo someRepo;
   public void method(int w, int devs) {
      System.out.println("Status report for project Colibri");
      int days = w * 5; // work days per week
      System.out.println("Worked weeks " + w);
      int md = days * (devs - 1);
      try {
         System.out.println("Inner logic that has to change " + md);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}

class Caller1 {
   Parameters parameters;
   public void f(int weeks) {
      parameters.method(weeks, 4);
   }
}

class Caller2 {
   Parameters parameters;
   public void g(int weeks) {
      parameters.method(weeks, 3);
   }
}

