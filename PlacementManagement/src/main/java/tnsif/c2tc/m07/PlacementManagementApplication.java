package tnsif.c2tc.m07;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tnsif.c2tc.m07.Repository.StudentRepo;

@SpringBootApplication
public class PlacementManagementApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(PlacementManagementApplication.class, args);
		StudentRepo studentRepo = context.getBean(StudentRepo.class);
	}

}
