public class Puzzle {
    private static String message = "Hello, World"; //this also need to be made static for hello() to access it

    public static void hello(){ //the syntax error is here, hello() is not static. Hello() must be static in order for it to be able to be called in the static context of Main
        System.out.println(message);
    }

    public static void main(String[] args) {
        hello();
    }
}
