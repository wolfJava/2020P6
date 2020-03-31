package task.abstractfactory;


public abstract class PayFactory {

    public void init(){
        System.out.println("初始化");
    }

    protected abstract IRecord createRecord();

    protected abstract IWithdraw createWithdraw();



}
