package ThirdDay.homework2.polymorphismDemo;

public class EmailLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Logged to email: "+ message);
    }
}
