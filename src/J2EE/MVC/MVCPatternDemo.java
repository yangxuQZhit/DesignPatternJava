package J2EE.MVC;

/**
 * @ClassName MVCPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 14:11
 **/
public class MVCPatternDemo {
    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

    public static void main(String[] args){
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("John");

        controller.updateView();
    }
}
