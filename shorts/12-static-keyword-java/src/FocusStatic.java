public class FocusStatic {

    static String mode = "Static calm mode: on";

    static void displayFocusLevel() {
        System.out.println("Focus level: 100%");
        System.out.println(mode);
    }

    public static void main(String[] args) {
        displayFocusLevel();
    }
}