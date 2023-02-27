public class Point {
    /**
     * A class Point has private fields double x and double y. Write a copy constructor for this class.
     */
    private double x, y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(Point other){
        this.x = other.x;
        this.y = other.y;

    }
}
