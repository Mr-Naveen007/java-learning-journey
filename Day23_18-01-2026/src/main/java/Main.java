public class Main {

    interface NotificationService {
        void send(String msg);
    }

    static class EmailNotification implements NotificationService {
        @Override
        public void send(String msg) {
            System.out.println("Email sent: " + msg);
        }
    }

    static class SmsNotification implements NotificationService {
        @Override
        public void send(String msg) {
            System.out.println("SMS sent: " + msg);
        }
    }

    record NotificationManager(NotificationService notificationService) {

        public void notifyUser(String msg) {
            notificationService.send(msg);
        }
    }

    public static void main(String[] args) {

        new NotificationManager(new EmailNotification())
                .notifyUser("Welcome via Email");

        new NotificationManager(new SmsNotification())
                .notifyUser("Welcome via SMS");
    }
}
