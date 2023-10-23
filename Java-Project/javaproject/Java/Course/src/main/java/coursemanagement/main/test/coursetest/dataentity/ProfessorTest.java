package coursemanagement.main.test.coursetest.dataentity;

import coursemanagement.main.DataModel.DataEntity.ProfessorEntity;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProfessorTest {

	private final static int id = 1;
	private final static String name = "Test";
	private final static String surname = "Test";

	private ProfessorEntity Professor;

	@Before
	public void setUp() {
		Professor = new ProfessorEntity(id,name,surname);
	}

	@Test
	public void testProfessorConstructor() {
		assertEquals(name, Professor.getName());
		assertEquals(surname, Professor.getSurname());
	}
}
