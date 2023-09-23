package SecondDay.homework2.inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.calculateCredit(new TeacherCreditManager());

    }
}
