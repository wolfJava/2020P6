package factory.abstractfactory;

public class Test {

    public static void main(String[] args) {
        //抽象工厂模式：复杂产品的工厂
        CourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }

}
