class CalmState {
    void show() {
        System.out.println("Calm focus.");
    }
}

class DeepState extends CalmState {
    @Override
    void show() {
        System.out.println("Deep focus.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        CalmState normal = new CalmState();
        CalmState deep = new DeepState(); //polymorphism

        normal.show();
        deep.show();
    }
}

