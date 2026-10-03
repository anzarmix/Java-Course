package task6;

public class MistakenEmailSender extends BaseSender {
    public String send(String recipient) {
        return "Email отправлен для " + recipient;
    }
}
