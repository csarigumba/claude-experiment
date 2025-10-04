public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor prevents instantiation from other classes
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton instance!");
    }

    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Verify it's the same instance
        Singleton anotherReference = Singleton.getInstance();
        System.out.println("Same instance? " + (singleton == anotherReference));
    }
}
