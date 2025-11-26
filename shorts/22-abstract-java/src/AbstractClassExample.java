//Abstract base - incomplete form
abstract class NightFormAbstract {
    abstract void show();
}

//Concrete form - completes the behavior
class MoonFormAbstract extends NightFormAbstract {
    void show() {
        System.out.println("Silent abstract form...");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        NightFormAbstract form = new MoonFormAbstract(); // abstract -> concrete
        form.show();
    }
}