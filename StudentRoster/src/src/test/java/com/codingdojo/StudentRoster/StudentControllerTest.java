package com.codingdojo.StudentRoster;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.codingdojo.controller.StudentController;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest(StudentController.class)
public class StudentControllerTest {
	
	/*
	 * @Autowired - a Spring annotation that will find you
	 * a version of whatever you specify and inject that
	 * dependency.
	 * 
	 */

	@Test
	public void contextLoads() {
	}
	
	@Autowired
    private MockMvc mockMvc;
	
	/*
	 * Remember we are mocking Springs MVC structure.
	 * 
	 * Which is to say we are using a fake version of
	 * Spring MVC so we can isolate our tests to just
	 * the @Controller we're creating
	 * 
	 */
	
	@Test
    public void shouldBeOkWhenAccessingStudents() throws Exception { 
        // Arrange - Grab mockMvc
    	//mockMvc
    	// Act - Perform the Mock request to localhost:8080/students
        //.perform(get("/students"))
        // Assert - Assert that we got back a 2xx HTTP status	
        //.andExpect(status().isOk());
    }
	
	@Test
    public void shouldReturnStudentsTemplateWhenAccessingStudents() throws Exception {
		
		// Arrange mockMvc
    	// Act .perform(get("/students"))
    	// Assert.andExpect(view().name("students"));
    }
		
	
	 @Test
	    public void shouldBeOkWhenAccessingStudent() throws Exception { 
		 
		// Arrange - Grab mockMvc mockMvc
	    	// Act - Perform the Mock request to localhost:8080/students .perform(get("/students/1"))
	        // Assert - Assert that we got back a 2xx HTTP status.andExpect(status().isOk());
		 
	 }
	 
	 @Test
	    public void shouldReturnStudentTemplateWhenAccessingStudent() throws Exception {
		 
		// Arrange mockMvc
	    	// Act.perform(get("/students/1"))
	    	// Assert.andExpect(view().name("student"));
		 
	 }

}
