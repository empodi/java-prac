package CH07;

final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        // Singleton s = new Singleton(); // 오류. Singleton() has private access in Singleton
        Singleton s = Singleton.getInstance();
    }
}
