public class Main {

    static void focus() {
        System.out.println("Focus deep. Code quiet.");
    }

    static void focus(String mood) {
        System.out.println("Focus " + mood + ".");
    }

    static void focus(String mood, int minutes) {
        System.out.println("Focus " + mood + " for " + minutes + " minutes.");
    }

    public static void main(String[] args) {
        focus();
        focus("calm");
        focus("silent", 45);
    }
}