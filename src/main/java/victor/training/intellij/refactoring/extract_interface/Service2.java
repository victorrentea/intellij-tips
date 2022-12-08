package victor.training.intellij.refactoring.extract_interface;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class Service2 {
    private final TaxCalculator service;

    public void computeVAT(int parcelValue) {
        System.out.println("This too");
        int tax = service.computeTax(parcelValue);
        System.out.println(tax);
    }
}

