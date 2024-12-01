package coursemanagement.main.test.coursetest;

import coursemanagement.main.DataModel.DataEntity.StudentEntity;
import coursemanagement.main.DataRepositories.StudentRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class DemoApplicationTest {

    @Autowired
    private StudentRepository studentRepository;

    private StudentEntity student;

    @Before
    public void setUp() {
        student = new StudentEntity(5, "test", "test");
    }

    @Test
    public void saveStudent() {
        student = studentRepository.save(student);
    }

    @Test
    public void updateStudent() {
        student = studentRepository.save(student);
        StudentEntity student1 = studentRepository.findById(student.getId()).orElse(null);
        student1.setName("Mike");
        studentRepository.save(student1);
    }

    @Test
    public void deleteStudent() {
        student = studentRepository.save(student);
        StudentEntity student1 = studentRepository.findById(student.getId()).orElse(null);
        if (student1 != null) {
            studentRepository.delete(student1);
        }
    }
}
