class Focus {
    String state = "Calm";

    void showState() {
        System.out.println(state + "!");
    }
}

class DeepFocus extends Focus {
    void intensify() {
        state = "Deep Focus";
    }
}

public class Inheritance {
    public static void main(String[] args) {
        DeepFocus df = new DeepFocus();

        df.showState();
        df.intensify();
        df.showState();
    }
}