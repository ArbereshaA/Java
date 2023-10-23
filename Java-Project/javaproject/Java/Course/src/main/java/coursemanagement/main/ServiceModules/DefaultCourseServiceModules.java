package coursemanagement.main.ServiceModules;

import coursemanagement.main.DataModel.DataEntity.CourseEntity;
import coursemanagement.main.DataModel.DataInputs.CourseInput;
import coursemanagement.main.DataRepositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DefaultCourseServiceModules implements CourseServiceModules {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<CourseEntity> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public CourseEntity findCourseById(Integer id) {
        if (id == null) {
            return null;
        }
        return courseRepository.findCourseById(id);
    }

    @Override
    public CourseEntity save(CourseInput CourseInput) {
        String newName = CourseInput.getName();
        String newProfessor = CourseInput.getprofessor();
        String newDescription = CourseInput.getDescription();




        CourseEntity CourseEntity = new CourseEntity();
        CourseEntity.setName(newName);
        CourseEntity.setprofessor(newProfessor);
        CourseEntity.setDescription(newDescription);



        return courseRepository.save(CourseEntity);
    }

    @Override
    public CourseEntity update(CourseEntity CourseEntity, CourseInput CourseInput) {
        String updateName = CourseInput.getName();
        String updateProfessor = CourseInput.getprofessor();
        String updateDescription = CourseInput.getDescription();

        CourseEntity.setName(updateName);
        CourseEntity.setprofessor(updateProfessor);
        CourseEntity.setDescription(updateDescription);


        return courseRepository.save(CourseEntity);
    }

    @Override
    public void delete(Integer id) {
        CourseRepository.deletebyId(id);
    }

}
