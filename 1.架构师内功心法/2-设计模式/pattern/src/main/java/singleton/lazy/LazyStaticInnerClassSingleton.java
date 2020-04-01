package singleton.lazy;

/**
 classPath：LazyStaticInnerClassSingleton.class
 LazyStaticInnerClassSingleton$LazyHolder.class
 *  优点：写法优雅，很好利用java语法特点，内部类用到的时候再加载特性，性能高，避免内存浪费,不能被反射破坏
 *  缺点：不优雅
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){
        if (null != LazyHolder.INSTANCE){
            throw new RuntimeException("不允许非法访问");
        }
    }

    public static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }



}
