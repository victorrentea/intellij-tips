package victor.training.legacy;

public class LegacyClient {
   private final LegacyCode legacyCode;

   public LegacyClient(LegacyCode legacyCode) {
      this.legacyCode = legacyCode;
   }

   public void clientCode() {
       legacyCode.deepMethod(2);
       legacyCode.deepMethod(3);
   }
}
