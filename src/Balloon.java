import java.awt.*;

public class Balloon {
    double radius;
    Color color;
    /**
     * 5) Java's class Color has a constructor that takes three integers as parameters: the red, green and blue components of the color.
     * A class Balloon has two fields: double radius and Color color. Write a constructor for the Balloon class that takes no parameters and
     * sets the balloon's radius to 10 and its color to "sky blue" (with RGB values 135, 206, and 250).
     */
    public Balloon(){
        radius = 10;
        color = new Color(135,206,250);
    }



    public static void main(String[] args) {
        Balloon temp = new Balloon();
        System.out.println(temp);
    }
}
