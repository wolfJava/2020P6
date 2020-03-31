package task.factorymethod;

public class UnionPayFacory implements IPayFactory {
    public IPay create() {
        return new UnionPay();
    }
}
