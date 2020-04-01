package lazy;

import singleton.lazy.LazyDoubleCheckSingleton;
import singleton.lazy.LazySimpleSingleton;
import singleton.lazy.LazyStaticInnerClassSingleton;
import singleton.register.ContainerSingleton;
import singleton.threadlocal.ThreadLocalSingleton;

public class ExectorThread implements Runnable {
    public void run() {
//        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
//        LazyStaticInnerClassSingleton instance = LazyStaticInnerClassSingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        Object instance = ContainerSingleton.getInstance("lazy.Pojo");
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "：" + instance);
    }
}
