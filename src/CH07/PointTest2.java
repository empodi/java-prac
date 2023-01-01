package CH07;

class Point3DTest2 extends Point {
    int z = 30;
    Point3DTest2() {
        this(100,200,300);
    }
    Point3DTest2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

class PointTest2 {
    public static void main(String[] args) {
        Point3DTest2 p3 = new Point3DTest2();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}
