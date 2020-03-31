package task.factorymethod;

public class WechatPay implements IPay {
    public void pay() {
        System.out.println("微信支付");
    }
}
