package decoupledMicro.inventory;

import java.util.List;

public interface InventoryServiceI<T> {

    List<T> getInventory();

    public void addItem(T o);

    public void removeItem(T o);

}
