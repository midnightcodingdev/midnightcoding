class FocusArrays{
    String state;

    FocusArrays(String state) {
        this.state = state;
    }

    void show() {
        System.out.println(state);
    }

    public static void main(String[] args) {
        FocusArrays[] sessions = {
            new FocusArrays("Calm"),
            new FocusArrays("Flow"),
            new FocusArrays("Deep")
        };

        for (FocusArrays f : sessions) {
            f.show();
        }
    }
}