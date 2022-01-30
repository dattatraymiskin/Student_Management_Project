package com.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	/*
	 * @Autowired
	 *private StudentRepository studentRepository;
	 */
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1=new Student("datta","miskin","datta@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2=new Student("shubham","talbhandare","shubham@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3=new Student("ram","pawar","ram@gmail.com");
		 * studentRepository.save(student3);
		 */
		
	}

}
