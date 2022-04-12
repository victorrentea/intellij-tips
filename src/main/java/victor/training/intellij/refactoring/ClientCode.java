package victor.training.intellij.refactoring;

import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;


public class ClientCode {
   @Autowired
   private BlueService service;

   public void method() {
      Color color = service.getColor();
   }
}

