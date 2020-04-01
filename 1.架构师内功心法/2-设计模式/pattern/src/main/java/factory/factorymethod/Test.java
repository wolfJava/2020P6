package factory.factorymethod;

public class Test {


    public static void main(String[] args) {
        //工厂方法模式：工厂的工厂
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();
    }







}
