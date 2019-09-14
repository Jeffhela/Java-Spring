package repositories;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;

import com.codingdojo.model.Student;

public class StudentRepositoryTest {
	
	@Resource
	private StudentRepository studentRepo;
	
	@Test
	public void shouldAcceptStudents() {
		//Arrange
		Student max = new Student(5L, "Justin", "Beiber", "25");
		//Act
		int repoSizeBeforeAdding = studentRepo.size();
		studentRepo.add(max);
		int repoSizeAfterAdding = studentRepo.size();
		//Assert
		assertThat(repoSizeAfterAdding, is(equalTo(repoSizeBeforeAdding + 1)));
	}
	
	@Test
	public void findOneShouldReturnOneStudent() {
		Student max = new Student(1L, "Max", "James", "35");
		
		studentRepo.add(max);
		Student result = studentRepo.findOne(1L);
		
		assertThat(result.getfirstName(), is("Max"));
	}
	
	@Test
	public void findAllShouldReturnAllStudents() {
		Student ingrid = new Student(6L, "Ingrid", "Benjamin", "32");
		Student riley = new Student(7L, "Riley", "Thomas", "27");
		
		studentRepo.add(ingrid);
		studentRepo.add(riley);
		
		Collection<Student> result = studentRepo.findAll();
		
		assertThat(result, hasItems(ingrid, riley));
	}

}
