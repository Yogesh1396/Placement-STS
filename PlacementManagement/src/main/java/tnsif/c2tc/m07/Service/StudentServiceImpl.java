package tnsif.c2tc.m07.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnsif.c2tc.m07.Entity.Student;
import tnsif.c2tc.m07.Repository.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired 
    StudentRepo sr;
    
	@Override
	public void addStudent(Student student) {
		sr.save(student);
	
	}

	@Override
	public Student updateStudent(Student student) {
		
		return null;
	}

	@Override
	public Student searchStudentById(long id) {
		return null;
		
	}

	@Override
	public Student searchStudentByHallTicket(long id) {
	
		return null;
	}

	@Override
	public boolean deleteStudent(long id) {
	return true ;
	}

	@Override
	public void addCertificate(String certificate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCertificate(String certificate) {
		// TODO Auto-generated method stub
		
	}

}
