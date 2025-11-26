//final variable - cannot be reassigned
class FinalVariableExample {
    final int value = 11;
}

// final method - cannot be overridden
class NightFormFinal {
    final void show() {
        System.out.println("Silent final form...");
    }
}

//final class - cannot be extended
final class MoonFormFinal {
    void reveal() {
        System.out.println("Silent final class...");
    }
}

public class FinalKeywordExample {
    public static void main (String[] args) {
        FinalVariableExample v = new FinalVariableExample();
        System.out.println("Final value: " + v.value);

        NightFormFinal base = new NightFormFinal();
        base.show();

        MoonFormFinal moon = new MoonFormFinal();
        moon.reveal();
    }
}