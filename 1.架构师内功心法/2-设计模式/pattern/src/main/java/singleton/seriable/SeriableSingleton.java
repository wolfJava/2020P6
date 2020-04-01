package singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {

    //序列化
    //把内存中对象的状态转化为字节码的形式
    //把自己码通过IO输出流，写到磁盘上
    //永久保留下来，持久化

    //反序列化
    //将持久化字节码内容，通过IO输入流读取到内存中
    //转换为一个JAVA对象

    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        //属于桥接模式
        return INSTANCE;
    }

}
