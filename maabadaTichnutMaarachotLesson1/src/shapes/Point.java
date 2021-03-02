package shapes;

public final class Point {
    //immutable class
    private int x,y;
    public Point(int x ,int y)
    {
        super();
        this.x = x;
        this.y = y;
    }
    // copy constructor
    public Point(Point p)
    {
        super();
        this.x = p.x;
        this.y = p.y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public Point move(int dx , int dy)
    {
        Point p = new Point(this);
        p.x+=dx; // x=x+dx
        p.y+=dy;// y =y+dy
        return p;
    }

    public void print()
    {
        System.out.println("point x="+x+" y="+y);
    }
}
