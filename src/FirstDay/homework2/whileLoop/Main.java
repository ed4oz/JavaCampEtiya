package FirstDay.homework2.whileLoop;

public class Main {
    public static void main(String[] args) {
        //for
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For loop has ended.");


        int i = 2;
        //while
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While loop has ended.");
    }
}
