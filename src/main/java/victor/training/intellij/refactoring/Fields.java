package victor.training.intellij.refactoring;

import org.junit.jupiter.api.Test;

public class Fields {
    @Test
    public void test1() {
        DataObject data = new DataObject();
        data.x = "xman";
        new TestedClass().f(data);
    }
    @Test
    public void test2() {
        DataObject data = new DataObject();
        data.x = "xwoman";
        new TestedClass().f(data);
    }
}

class TestedClass {
    public void f(DataObject data) {
        String x = data.x.toUpperCase();
        System.out.println(x);
    }
}

class DataObject {
    public String x;
    public String y;
}

// - extract field (Yuck: long-lived state, temporary field code smell)
// - inline field
// - encapsulate fields / inline accessors