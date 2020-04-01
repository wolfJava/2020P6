package singleton.hungry;

public class HungryStaticSingleton {
    //类加载顺序
    //先静态后动态
    //先上后下
    //先属性后方法
    private static final HungryStaticSingleton instance;

    private HungryStaticSingleton(){}

    static {
        instance = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance(){
        return instance;
    }

}
