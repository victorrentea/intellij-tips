package victor.training.intellij.refactoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;


@Service
class SomeService {
   @Autowired
   private BlueService service;

   public void method() {
      Color color = service.getColor();
      System.out.println(color);
   }
}

class BlueService {
   public Color getColor() {
      return Color.BLUE;
   }
}

