import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class TheTest {
   
   
   @Test
   public void test() {
      assertEquals(1, method());
   }
   public int method() {
       return 1;
   }
}
