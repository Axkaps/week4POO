package decoupledMicro.payment;

import decoupledMicro.inventory.Item;

public class MBWay implements PaymentServiceI<Item> {

    @Override
    public void pay(int amount, Item item) {
        System.out.println("Payment of " + amount + " completed! Bought " + item.getItemName());
    }

    @Override
    public void sell(int amount, Item item) {
        System.out.println("Sold " + item.getItemName() + " for " + amount + " completed!");
    }
}
