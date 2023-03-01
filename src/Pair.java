public class Pair {
    private double first, second;

    public Pair(double a, double b){
        first = a;
        second = b;
    }
    public void swap(){
        double temp = first; first = second;  second = temp;
    }
    /*
    namespace conflict
    public Pair swap(){
        return new Pair(first, second);
    }
     */
}
