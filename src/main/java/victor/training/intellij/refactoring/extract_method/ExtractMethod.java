package victor.training.intellij.refactoring.extract_method;

import lombok.RequiredArgsConstructor;
import victor.training.intellij.support.CustomerProfile;
import victor.training.intellij.support.dirty.Customer;

@RequiredArgsConstructor
class ExtractMethod {
    private final Dependency dependency;
    
    public void f(int n) {
        System.out.println("Logic F");
        for (int i = 0; i < 4; i++) {
            if (n + i < 0) {
                sendMessage("Code " + i);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
    public void g(int n) {
        System.out.println("Logic G");
        try {
            for (int j = 0; j < 4; j++) {
                if (n + j < 0) {
                    sendMessage("Code" + j);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Rethrow", e);
        }
    }

    public void sendMessage(String message) {
        System.out.println(message);
    }

    public void businessLogic(CustomerProfile customer) {

        // Heavy business logic
        // Heavy business logic
        // Heavy business logic
        // Where can I move this bit of domain logic operating on the state of a single entity?
        int discountPercentage = 3;
        if (customer.isGoldMember()) {
            discountPercentage += 1;
        }
        System.out.println("Biz Logic with discount " + discountPercentage);
        // Heavy business logic
        // Heavy business logic
    }

}