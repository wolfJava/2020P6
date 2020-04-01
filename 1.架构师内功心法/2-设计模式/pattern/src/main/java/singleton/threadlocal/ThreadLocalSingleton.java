package singleton.threadlocal;

/**
 * 这个是基于线程的，在一个线程内，他的对象是同一个
 * 不同线程中，是不一样的对象
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

}
