package victor.training.intellij.refactoring.extract_interface;

public class TaxCalculator {
    // TODO we have to support a new way to compute taxes
    public int computeTax(int parcelValue) {
        return parcelValue / 2;
    }
}
