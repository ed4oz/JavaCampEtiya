package FirstDay.intro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World :)");

        String ortametin = "İlginizi çekebilir";
        String altMetin = "Vade Süresi";

        System.out.println(ortametin);

        int vade = 12;

        double dolarDun = 18.10;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = true;

        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan..", "Mutlu Emekli"};

        System.out.println(krediler[0]);
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }

}
