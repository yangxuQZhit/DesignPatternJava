package J2EE.transferobject;

/**
 * @ClassName TransferObjectPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-19 08:55
 **/
public class TransferObjectPatternDemo {
    public static void main(String[] args){
        StudentBO studentBusinessObject = new StudentBO();

        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [ Roll No : " + student.getRollNo() + ", Name : " +
                    student.getName() + " ]");
        }

        StudentVO student = studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        studentBusinessObject.getStudent(0);
        System.out.println("Student: [ Roll No : " + student.getRollNo() + ", Name : " +
                student.getName() + " ]");
    }
}
