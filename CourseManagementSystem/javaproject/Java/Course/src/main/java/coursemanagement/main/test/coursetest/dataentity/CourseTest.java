package coursemanagement.main.test.coursetest.dataentity;

import coursemanagement.main.DataModel.DataEntity.CourseEntity;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CourseTest {

    private final static int id = 1;
    private final static String name = "Operating System";
    private final static String professorName = "John";
    private final static String description = "3rd Semester";

    private CourseEntity course;

    @Before
    public void setUp() {
        course = new CourseEntity(id, name, professorName, description);
    }

    @Test
    public void testCourseConstructor() {
        assertEquals(professorName, course.getProfessor());
        assertEquals(name, course.getName());
        assertEquals(description, course.getDescription());
    }
}
