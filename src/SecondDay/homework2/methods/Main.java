package SecondDay.homework2.methods;

public class Main {
    public static void main(String[] args) {
        findNumber();

    }
    public static void findNumber() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int numberToSearch = 6;
        boolean isExist = false;
        for (int number : numbers) {
            if (number == numberToSearch) {
                isExist = true;
                break;
            }
        }
        String message = "";
        if (isExist) {
            message = "Sayı mevcuttur: " + numberToSearch;
            getMessage(message);
        } else {
            getMessage("Sayı mevcut değildir: " + numberToSearch);
        }

    }

    private static void getMessage(String message) {
        System.out.println(message);
    }
}

