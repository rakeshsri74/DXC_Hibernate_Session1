package com.dxc.dao;

import java.util.List;

import org.hibernate.Session;

import com.dxc.model.Student;
import com.dxc.util.HibernateUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public int saveStudent(String firstName, String lastName, String section) {
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setSection(section);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		int id = (Integer)session.save(student);
		session.getTransaction().commit();
		session.close();
		
		return id;
	}

	@Override
	public List<Student> getAllStudent() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<Student> stus = (List<Student>)session.createQuery("FROM Student s ORDER BY s.firstName ASC").list();
		
		session.getTransaction().commit();
		session.close();
		
		return stus;
	}

	@Override
	public void updateStudent(int id, String section) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		Student student = (Student)session.get(Student.class,id);
		student.setSection(section);
		//session.update(student);//no need to call update manually as it will be updated automatically on transaction close
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void deleteStudent(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		Student student = (Student)session.get(Student.class,id);
		session.delete(student);
		session.getTransaction().commit();
		session.close();

	}

}
