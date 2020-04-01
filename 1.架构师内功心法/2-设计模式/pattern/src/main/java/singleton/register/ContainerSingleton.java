package singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例如何解决线程安全问题
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className) {
        if (!ioc.containsKey(className)) {
            synchronized (ContainerSingleton.class){
                if (ioc.containsKey(className)){
                    return ioc.get(className);
                }
                Object instance = null;
                try {
                    instance = Class.forName(className).newInstance();
                    ioc.put(className, instance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return instance;
            }
        } else {
            return ioc.get(className);
        }
    }


}
