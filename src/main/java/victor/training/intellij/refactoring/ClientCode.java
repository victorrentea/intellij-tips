package victor.training.intellij.refactoring;

import java.awt.*;

public class ClientCode {
   private final BlueService service;
   public ClientCode(BlueService service) {
      this.service = service;
   }

   public void method() {
      Color color = service.getColor();
   }
}

