package coursemanagement.main.DataRepositories;

import coursemanagement.main.DataModel.DataEntity.CourseEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<CourseEntity, Integer> {

    static void deletebyId(Integer id) {
    }

    List<CourseEntity> findAll();
    CourseEntity findCourseById(Integer id);

}
