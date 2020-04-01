package lazy;


import singleton.register.ContainerSingleton;

public class ContainerSingletonTest {

    public static void main(String[] args){
        Object o1 = ContainerSingleton.getInstance("lazy.Pojo");
        Object o2 = ContainerSingleton.getInstance("lazy.Pojo");
        System.out.println(o1);
        System.out.println(o2);

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");

    }


}
