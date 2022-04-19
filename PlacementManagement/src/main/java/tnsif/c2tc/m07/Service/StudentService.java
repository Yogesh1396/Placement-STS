package tnsif.c2tc.m07.Service;

import tnsif.c2tc.m07.Entity.Student;

public interface StudentService {
	public void addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(long id);

	public Student searchStudentByHallTicket(long id);
	public void addCertificate(String certificate);
	public void updateCertificate(String certificate);
	public boolean deleteStudent(long id);
	
}
