package J2EE.dao;

/**
 * @ClassName DaoPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-17 18:41
 **/
public class DaoPatternDemo {
    public static void main(String[] args){
        StudentDao studentDao = new StudentDaoImpl();

        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [ RollNo: " + student.getRollNo() +
                    ", Name : " + student.getName() + " ]");
        }

        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.uppdateStudent(student);

        studentDao.getStudent(0);
        System.out.println("Student: [ RollNo : " + student.getRollNo() +
                ", Name : " + student.getName() + " ]");
    }
}
