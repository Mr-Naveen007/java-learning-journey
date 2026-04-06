public class Main {
    abstract static class NotificationService {
        abstract void send();
    }

    static class EmailNotification extends NotificationService {
        void send() {
            System.out.println("Email sent: " + "Welcome user");
        }
    }

    static class SmsNotification extends NotificationService {
        void send() {
            System.out.println("SMS sent: " + "Welcome user");
        }
    }

    record UserService(NotificationService notification) {

        void registerUser() {
            notification.send();
        }
    }

    public static void main(String[] args) {
        NotificationService service = new EmailNotification();
        UserService userService = new UserService(service);
        userService.registerUser();
    }
}
