abstract class NightFormAbstraction {
    abstract void show();
}

class MoonFormAbstraction extends NightFormAbstraction {
    @Override
    void show() {
        System.out.println("Silent abstraction...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        NightFormAbstraction form = new MoonFormAbstraction();
        form.show();
    }
}