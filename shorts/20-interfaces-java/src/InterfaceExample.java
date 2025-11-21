//interface defines the behavior
interface NightFormInterface {
    void show();
}

//Concrete form - implements the behavior
class MoonFormInterface implements NightFormInterface {
    @Override
    public void show() {
        System.out.println("Silent interface...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        NightFormInterface form = new MoonFormInterface(); //polymorphic reference
        form.show();
    }
}