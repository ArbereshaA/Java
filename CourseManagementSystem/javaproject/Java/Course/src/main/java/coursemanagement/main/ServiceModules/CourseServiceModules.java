package coursemanagement.main.ServiceModules;

import coursemanagement.main.DataModel.DataEntity.CourseEntity;
import coursemanagement.main.DataModel.DataInputs.CourseInput;

import java.util.List;

public interface CourseServiceModules {

    List<CourseEntity> findAll();
    CourseEntity findCourseById(Integer id);
    CourseEntity save(CourseInput CourseInput);
    CourseEntity update(CourseEntity CourseEntity, CourseInput CourseInput);
    void delete(Integer id);
}
