package FirstDay.homework2.vowels;

public class Main {
    public static void main(String[] args) {
        char harf = 'İ';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli harfler.");
                break;
            default:
                System.out.println("ince sesli harfler.");
        }
    }
}
