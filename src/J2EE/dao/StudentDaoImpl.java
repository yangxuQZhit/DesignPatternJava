package J2EE.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StudentDaoImpl
 * @Description
 * @Author yangxu
 * @Date 2019-12-17 18:44
 **/
public class StudentDaoImpl implements StudentDao {
    private List<Student> students;

    public StudentDaoImpl() {
        this.students = new ArrayList<>();
        students.add(new Student("Robert", 0));
        students.add(new Student("John", 1));
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void uppdateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database.");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: RollNo " + student.getRollNo() + ", delete from database.");
    }
}
