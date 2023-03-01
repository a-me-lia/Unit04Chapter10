public class Disk {
    private Point center;
    private double radius;

    public Disk(Point ct, double rd){
        center = ct;
        radius = rd;
    }

    public Disk(Disk other){
        this.center = new Point(other.center);
        this.radius = other.radius;
    }

}
