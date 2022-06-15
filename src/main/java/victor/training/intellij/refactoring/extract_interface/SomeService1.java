package victor.training.intellij.refactoring.extract_interface;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SomeService1 {
    private final TaxCalculator service;

    public void estimateCosts(int parcelValue) {
        int tax = service.computeTax(parcelValue);
        System.out.println(tax);
    }
}
