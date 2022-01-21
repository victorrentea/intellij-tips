package victor.training.livecoding;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RequireArgs {
   private final Dep1 dep1;
   private final Dep2 dep2;

   public void method() {


      System.out.println("Stuff with " + dep1 + " and " + dep2);
   }
}

class Dep1 {}
class Dep2 {}
