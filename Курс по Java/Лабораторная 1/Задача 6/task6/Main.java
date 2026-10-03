package task6;

public class Main {
    public static void main(String[] args) {
        BaseSender mistakenThroughBaseType = new MistakenEmailSender();
        System.out.println(mistakenThroughBaseType.send("student@example.com"));

        MistakenEmailSender mistakenThroughChildType = new MistakenEmailSender();
        System.out.println(mistakenThroughChildType.send("student@example.com"));

        BaseSender correctedThroughBaseType = new CorrectEmailSender();
        System.out.println(correctedThroughBaseType.send("student@example.com"));
    }
}
