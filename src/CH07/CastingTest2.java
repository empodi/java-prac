package CH07;

class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car; // !!컴파일은 가능하지만 런타임 에러 발생
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
