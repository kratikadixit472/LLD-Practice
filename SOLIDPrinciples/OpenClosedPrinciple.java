package SOLIDPrinciples;

public class OpenClosedPrinciple {
    public int operation(int a, int b, String type) {
        if(type == "+") {
            return a + b;
        }
        else if(type == "-") {
            return a - b;
        }
        return 0;
    }
}

interface InnerOpenClosedPrinciple {

    public int operation(int a, int b);
}

class AddOperation implements InnerOpenClosedPrinciple {
    public int operation(int a, int b) {
        return a + b;
    }
}

