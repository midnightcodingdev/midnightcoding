//Custom exception - calm but clear
class CalmDepthException extends Exception {
    CalmDepthException(String message) {
        super(message);
    }
}

//Class that uses throw + throws
class NightFormThrowThrows {
    // throws -> method may throw CalmDepthException
    void checkDepth(int level) throws CalmDepthException {
        if (level < 0) {
            //throw -> actually throwing the exception
            throw new CalmDepthException("Negative depth not allowed.");
        }
        System.out.println("Depth " + level + " is calm.");
    }
}

public class ThrowThrowsExample {
    public static void main(String[] args) {
        NightFormThrowThrows form = new NightFormThrowThrows();

        try {
            form.checkDepth(3);
            form.checkDepth(-1);
        } catch (CalmDepthException e) {
            System.out.println(e.getMessage());
        }
    }
}