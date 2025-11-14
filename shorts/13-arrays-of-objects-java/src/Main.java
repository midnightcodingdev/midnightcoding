class Focus{
    String state;

    Focus(String state) {
        this.state = state;
    }

    void show() {
        System.out.println(state);
    }

    public static void main(String[] args) {
        Focus[] sessions = {
            new Focus("Calm"),
            new Focus("Flow"),
            new Focus("Deep")
        };

        for (Focus f : sessions) {
            f.show();
        }
    }
}