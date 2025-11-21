class FocusEncapsulation {
    private String state = "Calm";

    public String getState() {
        return state;
    }

    public void setState(String newState) {
        state = newState;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        FocusEncapsulation f = new FocusEncapsulation();

        System.out.println(f.getState() + "!");

        f.setState("Deep Focus");
        System.out.println(f.getState() + "!");
    }
}