package victor.training.legacy;

public class LegacyClient {
   private final LegacyCode legacyCode;

   public LegacyClient(LegacyCode legacyCode) {
      this.legacyCode = legacyCode;
   }

   public void clientCode() {
      System.out.println(legacyCode.deepMethod(2));
      System.out.println(legacyCode.deepMethod(3));
   }
}
