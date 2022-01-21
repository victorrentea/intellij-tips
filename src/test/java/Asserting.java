import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Asserting {
   @Test
   void test() {
      int actual = testedCode();
      int expected = 1;

      assertThat(actual).isEqualTo(expected);
   }

   private int testedCode() {
      return 1;
   }
}
