package J2EE.dao;

import java.util.List;

/**
 * @interface StudentDao
 * @Description
 * @Author yangxu
 * @Date 2019-12-17 18:42
 **/
public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(int rollNo);
    void uppdateStudent(Student student);
    void deleteStudent(Student student);
}
