package coursemanagement.main.RequestCoordinator;

import coursemanagement.main.DataModel.DataEntity.StudentEntity;
import coursemanagement.main.DataModel.DataInputs.StudentInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class StudentRequestCoordinator {

    @Autowired
    private coursemanagement.main.ServiceModules.StudentServiceModules StudentServiceModules;

    @GetMapping("/student")
    public List<StudentEntity> getStudent() {
        return StudentServiceModules.findAll();
    }

    @GetMapping("/student/{id}")
    public StudentEntity findStudent(@PathVariable Integer id) {
        return StudentServiceModules.findStudentById(id);
    }

    @PostMapping("/student")
    public StudentEntity createStudent(@RequestBody StudentInput StudentInput) {
        return StudentServiceModules.save(StudentInput);
    }

    @PutMapping("/student/{id}")
    public StudentEntity updateStudent(@PathVariable Integer id,
                                       @RequestBody StudentInput StudentInput) {

        StudentEntity StudentEntity = StudentServiceModules.findStudentById(id);
        if (StudentEntity == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Note object with " + id + " not found!"
            );
        }

        return StudentServiceModules.update(StudentEntity, StudentInput);
    }

    @DeleteMapping("/student/{id}")
    public boolean deleteStudent(@PathVariable Integer id) {
        StudentServiceModules.delete(id);
        return true;
    }

}
