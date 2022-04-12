package victor.training.intellij.speed;

import java.util.Objects;

public class NewClass {

   private final String s;
   private final String p;

   public NewClass(String s, String p) {
      this.s = s;
      this.p = p;
   }

   public String getP() {
      return p;
   }

   public String getS() {
      return s;
   }

   @Override
   public String toString() {
      return "NewClass{" +
             "s='" + s + '\'' +
             ", p='" + p + '\'' +
             '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      NewClass newClass = (NewClass) o;
      return Objects.equals(s, newClass.s) && Objects.equals(p, newClass.p);
   }

   @Override
   public int hashCode() {
      return Objects.hash(s, p);
   }
}
