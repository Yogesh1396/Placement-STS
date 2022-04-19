package tnsif.c2tc.m07.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tnsif.c2tc.m07.Entity.Student;
import tnsif.c2tc.m07.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
 StudentService service;
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student student) {
		service.addStudent(student);
		
	}
	@GetMapping("/getStudent/{id}")
	public Student searchStudentById(@PathVariable long id)
	{
		return service.searchStudentById(id);
		
	}
	
	@GetMapping("/getStudent/{TicketNo}")
	public Student searchStudentByHallTicket(@PathVariable long id)
	{
		return service.searchStudentByHallTicket(id);
	}
	
	@PutMapping("/putStudent")
	public void updateStudent(@RequestBody Student s)
	{
		service.updateStudent(s);
	}
	@DeleteMapping("/deleteStudent")
	public void deleteStudent(@RequestBody long id)
	{
		service.deleteStudent(id);
	}
	 
}
