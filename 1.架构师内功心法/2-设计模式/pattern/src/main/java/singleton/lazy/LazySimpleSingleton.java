package singleton.lazy;

/**
 * 优点：节省了内存,线程安全
 * 缺点：性能低
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance = null;

    private LazySimpleSingleton(){}

    public synchronized static LazySimpleSingleton getInstance(){
        if (null == instance){
            instance = new LazySimpleSingleton();
        }
        return instance;
    }

}
