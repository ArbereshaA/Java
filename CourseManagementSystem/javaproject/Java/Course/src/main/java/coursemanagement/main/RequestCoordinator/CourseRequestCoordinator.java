package coursemanagement.main.RequestCoordinator;

import coursemanagement.main.DataModel.DataEntity.CourseEntity;
import coursemanagement.main.DataModel.DataInputs.CourseInput;
import coursemanagement.main.ServiceModules.CourseServiceModules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class CourseRequestCoordinator {

    @Autowired
    private CourseServiceModules CourseServiceModules;

    @GetMapping("/course")
    public List<CourseEntity> getcourse() {
        return CourseServiceModules.findAll();
    }

    @GetMapping("/course/{id}")
    public CourseEntity findCourse(@PathVariable Integer id) {
        return CourseServiceModules.findCourseById(id);
    }

    @PostMapping("/course")
    public CourseEntity createCourse(@RequestBody CourseInput courseinput) {
        return CourseServiceModules.save(courseinput);
    }

    @PutMapping("/course/{id}")
    public CourseEntity updateCourse(@PathVariable Integer id,
                                     @RequestBody CourseInput courseinput) {

        CourseEntity courseEntity = CourseServiceModules.findCourseById(id);
        if (courseEntity == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Course object with id " + id + " not found!"
            );
        }

        return CourseServiceModules.update(courseEntity, courseinput);
    }

    @DeleteMapping("/course/{id}")
    public boolean deleteCourse(@PathVariable Integer id) {
        CourseServiceModules.delete(id);
        return true;
    }

}
