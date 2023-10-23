package studentmanagement.main.test.studenttest.dataentity;

import coursemanagement.main.DataModel.DataEntity.StudentEntity;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

	private final static int id = 1;
	private final static String name = "Test";
	private final static String surname = "Test";

	private StudentEntity student;

	@Before
	public void setUp() {
		student = new StudentEntity(id, name,surname);
	}

	@Test
	public void teststudentConstructor() {
		assertEquals(name, student.getName());
		assertEquals(surname, student.getSurname());
	}
}
