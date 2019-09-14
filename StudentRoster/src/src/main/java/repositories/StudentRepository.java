package repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.codingdojo.model.Student;

@Repository
public class StudentRepository {
	
	private Map<Long, Student> students = new HashMap<>();

	public StudentRepository() {
		add(new Student(1L, "Max", "Johns", "35"));
		add(new Student(2L, "Kelli", "Bryant", "26"));
		add(new Student(3L, "Thomas", "Kane", "32"));
		add(new Student(4L, "Tre", "Dog", "21"));
		}

	public int size() {
		return students.size();
	}

	public void add(Student student) {
		students.put(student.getId(), student);
	}

	public Student findOne(Long id) {
		return students.get(id);
	}

	public Collection<Student> findAll() {
		return students.values();
	}
	
	
}