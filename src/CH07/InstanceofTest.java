package CH07;

class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if (fe instanceof FireEngine) {
            System.out.println("fe is a FireEngine instance");
        }
        if (fe instanceof Car) {
            System.out.println("fe is a Car instance");
        }
        if (fe instanceof Object) {
            System.out.println("fe is an Object instance");
        }
        System.out.println(fe.getClass().getName());    // 클래스의 이름 출력
    }
}
