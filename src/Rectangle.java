public class Rectangle {
    /**
     * Write a class Rectangle that represents a rectangle with integer width and height. Include a constructor that builds a rectangle with a
     * given width and height and another constructor (with one parameter) that builds a rectangle that is actually a square of a given size.
     * Make sure these constructors check that the width and height are positive. Add a constructor that takes no parameters and builds a square of size 1.
     */
    private int width, height;

    public Rectangle(int w, int h){
        width = w;
        height = h;
    }

    public Rectangle(int s){
        width = s;
        height = s;
    }

    public Rectangle(){
        width = 1;
        height = 1;
    }

    /**
     * Add a boolean method isSquare that returns true if and only if the rectangle is a square.
     * Add a void method quadratize that converts this rectangle into a square with approximately the same area --
     * the closest possible for a square with an integer size.
     */
    private boolean isSquare(){
         return(this.height == this.width);
    }

    private void quadratize(){
        double area = this.height *this.width;
        this.height = (int) Math.sqrt(area);
        this.width = (int) Math.sqrt(area);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(1,2);
        rect.quadratize();
        System.out.println(rect.isSquare());
    }
}
