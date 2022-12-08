package victor.training.intellij.refactoring;

import lombok.RequiredArgsConstructor;

interface SomeRepo {
   int findById(int id);
}
@RequiredArgsConstructor
public class Parameters {
   private final SomeRepo someRepo;
   public void method(int weeks, int devs) {
      System.out.println("Status report for project Colibri");
      int days = weeks * 5; // work days per week
      System.out.println("Worked weeks " + weeks);
      int mandays = days * (devs - 1);
      try {
         System.out.println("Inner logic that has to change " + mandays);
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

