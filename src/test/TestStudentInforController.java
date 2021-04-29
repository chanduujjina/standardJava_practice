package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.demo.mock.controller.StudentInfoController;
import com.demo.mock.pojo.Student;
import com.demo.mock.pojo.StudentInfo;

public class TestStudentInforController {
	
	
	StudentInfoController controller = null;
	
	
	
	@Before
	public void init() {
		
		controller =  new StudentInfoController();
		
	}
	
	
	@Test
	//puprose of this testcase to verify happy path
	public void testgetStudentById_positive() {
	
		Student student = controller.getStudentById("10JK1A0401");
		assertEquals("SAI", student.getName());
	}
	
	@Test
	
	public void testgetStudentById_negative() {
		
		Student student = controller.getStudentById("10JK1A0453");
		assertNull(student);
	}
	
	@Test
	public void testGetStudentInfoByID_Postive() {
		StudentInfo info =controller.getStudentInfoByID("10JK1A0401");
		assertNotNull(info);
		assertNotNull(info.getStudent());
		assertNotNull(info.getScholorship());
		assertEquals("SAI", info.getStudent().getName());
		assertEquals(45000, info.getScholorship().getAmoutt());
	}
	
	
	

}
