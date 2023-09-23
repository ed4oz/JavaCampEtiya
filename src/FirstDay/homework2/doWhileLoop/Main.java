package FirstDay.homework2.doWhileLoop;

public class Main {
    public static void main(String[] args) {
        //for
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For loop has ended.");

        //while
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While loop has ended.");

        //do-while
        int j = 2;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-while loop has ended.");
    }
}
