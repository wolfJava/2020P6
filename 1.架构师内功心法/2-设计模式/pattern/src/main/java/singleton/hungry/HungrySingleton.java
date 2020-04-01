package singleton.hungry;

/**
 * 恶汉式单例
 * 优点：执行效率高，性能高，没有任何的锁
 * 缺点：某些情况下，可能会造成内存浪费
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){}

    private static HungrySingleton getInstance(){
        return INSTANCE;
    }

}
