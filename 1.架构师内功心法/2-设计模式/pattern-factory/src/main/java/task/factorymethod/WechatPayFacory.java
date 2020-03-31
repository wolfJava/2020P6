package task.factorymethod;

public class WechatPayFacory implements IPayFactory {
    public IPay create() {
        return new WechatPay();
    }
}
