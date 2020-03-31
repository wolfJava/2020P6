package task.factorymethod;

public class AliPayFacory implements IPayFactory {
    public IPay create() {
        return new AliPay();
    }
}
