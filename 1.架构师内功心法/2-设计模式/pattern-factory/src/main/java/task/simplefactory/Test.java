package task.simplefactory;

public class Test {

    public static void main(String[] args) {
        IPay iPay = new PayFactory().create(AliPay.class);
        iPay.pay();
    }

}
