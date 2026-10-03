abstract class AbstractNotificationSender {

    public final void send(String recipient, String message) {
        if (recipient == null || recipient.isBlank()) {
            System.out.println("❌ Ошибка: адресат не указан");
            return;
        }

        System.out.println("📤 Отправка сообщения для: " + recipient);

        doSend(recipient, message);

        System.out.println("✅ Сообщение доставлено\n");
    }

    protected abstract void doSend(String recipient, String message);
}

class EmailNotificationSender extends AbstractNotificationSender {
    @Override
    protected void doSend(String recipient, String message) {
        System.out.println("   📧 [Email] Отправлено на " + recipient + ": \"" + message + "\"");
    }
}

class ConsoleNotificationSender extends AbstractNotificationSender {
    @Override
    protected void doSend(String recipient, String message) {
        System.out.println("   💻 [Console] Вывод для " + recipient + ": \"" + message + "\"");
    }
}

public class Task4 {
    public static void main(String[] args) {
        AbstractNotificationSender[] senders = {
            new EmailNotificationSender(),
            new ConsoleNotificationSender()
        };

        for (AbstractNotificationSender sender : senders) {
            sender.send("student@university.ru", "Лекция перенесена на 15:00");
        }

        System.out.println("--- Тест с пустым адресатом ---");
        senders[0].send("", "Тест");
    }
}
