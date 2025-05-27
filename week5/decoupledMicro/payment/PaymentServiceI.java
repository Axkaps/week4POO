package decoupledMicro.payment;

public interface PaymentServiceI<T> {

    public void pay(int amount, T o);

    public void sell(int amount, T o);

}
