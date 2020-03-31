package simplefactory;

import java.util.Calendar;

public class Test {

    public static void main(String[] args) {
        //简单工厂模式：产品的工厂
        ICourse course = new CourseFactory().create(JavaCourse.class);
        course.record();
        Calendar.getInstance();

    }

}
