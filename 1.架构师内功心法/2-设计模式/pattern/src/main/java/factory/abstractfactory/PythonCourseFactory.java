package factory.abstractfactory;

public class PythonCourseFactory extends CourseFactory {

    protected INote createNote() {
        super.init();
        return new PythonNote();
    }

    protected IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
    
}
