package decoupledMicro.notification;

public class CGD implements NotificationServiceI{

    @Override
    public void sendBuyNotification() {
        System.out.println("Notification Service sending buy notification. Thanks\nCaixa");
    }

    @Override
    public void sendSellNotification() {
        System.out.println("Notification Service sending sell notification. Thanks\nCaixa");
    }
}
