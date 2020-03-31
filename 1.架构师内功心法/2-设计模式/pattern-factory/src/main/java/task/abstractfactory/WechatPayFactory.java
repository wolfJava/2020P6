package task.abstractfactory;

public class WechatPayFactory extends PayFactory {
    protected IRecord createRecord() {
        super.init();
        return new WechatRecord();
    }

    protected IWithdraw createWithdraw() {
        super.init();
        return new WechatWithdraw();
    }
}
