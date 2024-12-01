package coursemanagement.main.ServiceModules;

import coursemanagement.main.DataModel.DataEntity.StudentEntity;
import coursemanagement.main.DataModel.DataInputs.StudentInput;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DefaultStudentServiceModules implements StudentServiceModules {

    @Autowired
    private coursemanagement.main.DataRepositories.StudentRepository StudentRepository;

    @Override
    public List<StudentEntity> findAll() {
        return StudentRepository.findAll();
    }

    @Override
    public StudentEntity findStudentById(Integer id) {
        if (id == null) {
            return null;
        }
        return StudentRepository.findStudentById(id);
    }

    @Override
    public StudentEntity save(StudentInput StudentInput) {
        String newName = StudentInput.getName();
        String newSurname = StudentInput.getSurname();

        StudentEntity StudentEntity = new StudentEntity();
        StudentEntity.setName(newName);
        StudentEntity.setSurname(newSurname);



        return StudentRepository.save(StudentEntity);
    }

    @Override
    public StudentEntity update(StudentEntity StudentEntity, StudentInput StudentInput) {
        String newName = StudentInput.getName();
        String newSurname = StudentInput.getSurname();


        StudentEntity.setName(newName);
        StudentEntity.setSurname(newSurname);


        return StudentRepository.save(StudentEntity);
    }

    @Override
    public void delete(Integer id) {
        StudentRepository.deleteById(id);
    }

}
