package singleton.lazy;

/**
 * 优点：性能高了，线程安全了
 * 缺点：可读性难度加大，不够优雅
 */
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton(){}

    private volatile static LazyDoubleCheckSingleton instance;

    public static LazyDoubleCheckSingleton getInstance(){
        if (null == instance){
            synchronized (LazyDoubleCheckSingleton.class){
                if (null == instance){
                    instance = new LazyDoubleCheckSingleton();
                    //指令重排序的问题
                }
            }
        }
        return instance;
    }


}
