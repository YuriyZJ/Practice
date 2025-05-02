package Level2.Chapter8_Tests.Task2_2;

public class AlertManager {
    private final NotificationService notificationService;

    public AlertManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendAlert(String level) {
        if ("HIGH".equals(level)) {
            notificationService.send("High level alert!");
        }
    }
}
