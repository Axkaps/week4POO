package decoupledMicro.inventory;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements InventoryServiceI<Item> {

    List<Item> items;

    public BookStore() {
        items = new ArrayList<Item>();
        items.add(new Item("House of the Dragon"));
        items.add(new Item("Breaking Bad"));
        items.add(new Item("Prison Break"));
    }

    @Override
    public List<Item> getInventory() {
        return items;
    }

    @Override
    public void addItem(Item o) {
        items.add(o);
    }

    @Override
    public void removeItem(Item o) {
        items.remove(o);
    }
}
