package task.factorymethod;

public class Test {

    public static void main(String[] args) {
        IPayFactory factory = new WechatPayFacory();
        IPay iPay = factory.create();
        iPay.pay();

    }


}
