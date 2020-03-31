package task.abstractfactory;

public class AliPayFactory extends PayFactory {
    protected IRecord createRecord() {
        super.init();
        return new AliRecord();
    }

    protected IWithdraw createWithdraw() {
        super.init();
        return new AliWithdraw();
    }
}
