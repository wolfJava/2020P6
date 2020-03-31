package task.abstractfactory;

public class UnionPayFactory extends PayFactory {
    protected IRecord createRecord() {
        super.init();
        return new UnionRecord();
    }

    protected IWithdraw createWithdraw() {
        super.init();
        return new UnionWithdraw();
    }
}
