public class Test { //complex method
    double eks, wye;
    public Test(double x, double y) {
    }
    public Test(double x){
    }
    public static void main(String[] args) {

        Test temp = new Test(1.0, 2);
        Test twmp = new Test(1);
        Test fvfv = new Test (1.0, 3);
        //Test erfvh = new Test();

        int x = 0;
        x++;

        Integer z = new Integer(0);
        String old = z.getClass().getName() + "@";
        System.out.println(z.getClass().getName() + "@" + z.hashCode());
        System.out.println(z);
        z++;
        String noo = z.getClass().getName() + "@";
        System.out.println(z.getClass().getName() + "@" + z.hashCode());
        System.out.println(old.equals(noo));
    }




}
