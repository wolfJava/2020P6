package task.abstractfactory;

public class Test {

    public static void main(String[] args) {
        //抽象工厂模式：复杂产品的工厂
        PayFactory factory = new AliPayFactory();
        factory.createWithdraw().withdraw();
        factory.createRecord().record();
    }


}
