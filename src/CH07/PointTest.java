package CH07;

class myPoint {
    int x, y;

    myPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    String getLocation() {
        return "x :" + x + ", y :" + y;
    }
}

class Point3DTest extends myPoint {
    int z;
    Point3DTest (int x, int y, int z) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    String getLocation() {      // 오버라이딩
        return "x :" + x + ", y :" + y + ", z :" + z;
    }
}

class PointTest {
    public static void main(String[] args) {
        Point3DTest p3 = new Point3DTest(1,2,3);
    }
}
