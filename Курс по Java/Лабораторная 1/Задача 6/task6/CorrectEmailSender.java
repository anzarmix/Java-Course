package task6;

public class CorrectEmailSender extends BaseSender {
    @Override
    public String send(Object recipient) {
        return "Email отправлен для " + recipient;
    }
}
