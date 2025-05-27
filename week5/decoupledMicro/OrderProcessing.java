package decoupledMicro;

import decoupledMicro.inventory.InventoryServiceI;
import decoupledMicro.notification.NotificationServiceI;
import decoupledMicro.payment.PaymentServiceI;

public class OrderProcessing<T> {

    NotificationServiceI notificationService;
    PaymentServiceI<T> paymentService;
    InventoryServiceI<T> inventoryService;

    public OrderProcessing(NotificationServiceI notificationService, PaymentServiceI<T> paymentService, InventoryServiceI<T> inventoryService) {
        this.notificationService = notificationService;
        this.paymentService = paymentService;
        this.inventoryService = inventoryService;
    }

    public void processBuyOrder(T o, int amount) {
        paymentService.pay(amount, o);
        notificationService.sendBuyNotification();
        inventoryService.removeItem(o);
    }

    public void processSellOrder(T o, int amount) {
        paymentService.sell(amount, o);
        notificationService.sendSellNotification();
        inventoryService.removeItem(o);
    }


}
