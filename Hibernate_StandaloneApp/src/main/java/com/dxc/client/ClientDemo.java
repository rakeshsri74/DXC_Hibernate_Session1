package com.dxc.client;

import java.util.List;

import com.dxc.dao.StudentDao;
import com.dxc.dao.StudentDaoImpl;
import com.dxc.model.Student;

public class ClientDemo {

	public static void main(String[] args) {
		StudentDao dao = new StudentDaoImpl();
		
		//Save few objects with hibernate
		
		int stu1 = dao.saveStudent("joe","david","Eng");
		int stu2 = dao.saveStudent("Rakesh","Srivastaw","CS");
		int stu3 = dao.saveStudent("Peter","Pan","Physics");
		int stu4 = dao.saveStudent("Jonshon","Brill","Science");
		int stu5 = dao.saveStudent("Bill","Laurent","Maths");
		
		//Retrive all records
		List<Student> students = dao.getAllStudent();
		for(Student s: students) {
			System.out.println(s);
		}
		
		//Update an object
		
		dao.updateStudent(stu5, "Arts");
		
		//Retrive all records
		List<Student> students1 = dao.getAllStudent();
		for(Student s: students1) {
			System.out.println(s);
		}
		
		//Delete an object
		
		dao.deleteStudent(stu4);
		
		//Retrive all records
		List<Student> students2 = dao.getAllStudent();
		for(Student s: students2) {
			System.out.println(s);
		}

	}
	
	
}
