interface NotificationSender {
    void send(String message);
    void send(String message, String priority); // перегрузка
}

class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }

    @Override
    public void send(String message, String priority) {
        System.out.println("Email [" + priority + "]: " + message);
    }
}

class ConsoleSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Console: " + message);
    }

    @Override
    public void send(String message, String priority) {
        System.out.println("Console [" + priority + "]: " + message);
    }
}

public class Task2 {
    public static void main(String[] args) {
        NotificationSender sender = new EmailSender();

        sender.send("Hello");           

        sender.send("Hello", "HIGH");   

        EmailSender email = new EmailSender();
        email.send("Hi");               

        
        NotificationSender ref = new ConsoleSender();
        ref.send("Test");               
    }
}