//Base form - defines default behavior
class NightFormOverriding {
    void show() {
        System.out.println("Silent form...");
    }
}

//Deeper form - overrides the behavior
class MoonFormOverriding extends NightFormOverriding {
    @Override
    void show() {
        System.out.println("Silent overridden form...");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        NightFormOverriding base = new NightFormOverriding();
        NightFormOverriding deep = new MoonFormOverriding(); //overriding in action

        base.show();
        deep.show();
    }
}