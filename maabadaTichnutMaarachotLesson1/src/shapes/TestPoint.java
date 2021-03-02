package shapes;

public class TestPoint {
    public static void main(String[] args) {
        Point p = new Point(2 ,9);
        System.out.println();
        p.move(10 ,-5).print();
        p.print();
    }
}
