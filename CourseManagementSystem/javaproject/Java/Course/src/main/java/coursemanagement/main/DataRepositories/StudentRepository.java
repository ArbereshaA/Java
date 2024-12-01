package coursemanagement.main.DataRepositories;

import coursemanagement.main.DataModel.DataEntity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

    List<StudentEntity> findAll();
    StudentEntity findStudentById(Integer id);

}
