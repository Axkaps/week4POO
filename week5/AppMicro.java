import decoupledMicro.*;
import decoupledMicro.inventory.BookStore;
import decoupledMicro.inventory.InventoryServiceI;
import decoupledMicro.inventory.Item;
import decoupledMicro.notification.CGD;
import decoupledMicro.notification.NotificationServiceI;
import decoupledMicro.notification.Santander;
import decoupledMicro.payment.MBWay;
import decoupledMicro.payment.PaymentServiceI;

public class AppMicro {


    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        CGD cgd = new CGD();
        Santander santander = new Santander();
        MBWay mbway = new MBWay();
        OrderProcessing<Item> orderProcessor = new OrderProcessing<>(santander, mbway, bookStore);


        orderProcessor.processBuyOrder(new Item("Prison Break"), 50);
        orderProcessor.processSellOrder(new Item("Prison Break"), 50);

    }

}
