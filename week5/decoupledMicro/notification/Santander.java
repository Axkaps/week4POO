package decoupledMicro.notification;

public class Santander implements NotificationServiceI{

    @Override
    public void sendBuyNotification() {
        System.out.println("Notification Service sending buy notification. Thanks\nSantander");
    }

    @Override
    public void sendSellNotification() {
        System.out.println("Notification Service sending sell notification. Thanks\nSantander");
    }
}
