package lazy;

import singleton.lazy.LazyStaticInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyStaticInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object instance1 = c.newInstance();
            Object instance2 = c.newInstance();
            System.out.println(instance1);
            System.out.println(instance2);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }





}
