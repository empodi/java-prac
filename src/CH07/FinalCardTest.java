package CH07;

class CardTest {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    CardTest(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }
    CardTest() {
        this("HEART", 1);
    }
    public String toString() {
        return KIND + " " + NUMBER;
    }
}

class FinalCardTest {
    public static void main(String[] args) {
        CardTest c = new CardTest("HEART", 10);
        // c.NUMBER = 5; // 에러. cannot assign a value to final variable
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
