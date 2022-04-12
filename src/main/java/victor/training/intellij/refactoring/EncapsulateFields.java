package victor.training.intellij.refactoring;

class DataObject {
   public int x;
   public int y;
}

class ClientAccessingFields {
   public void method(DataObject obj) {
      System.out.println(obj.y);
      obj.x = 1;
   }
}