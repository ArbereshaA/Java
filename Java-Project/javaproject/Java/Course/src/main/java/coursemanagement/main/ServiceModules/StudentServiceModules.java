package coursemanagement.main.ServiceModules;

import coursemanagement.main.DataModel.DataEntity.StudentEntity;
import coursemanagement.main.DataModel.DataInputs.StudentInput;

import java.util.List;

public interface StudentServiceModules {

    List<StudentEntity> findAll();
    StudentEntity findStudentById(Integer id);
    StudentEntity save(StudentInput StudentInput);
    StudentEntity update(StudentEntity location, StudentInput StudentInput);
    void delete(Integer id);
}
