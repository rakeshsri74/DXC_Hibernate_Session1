package com.dxc.dao;

import java.util.List;

import com.dxc.model.Student;

public interface StudentDao {
	public int saveStudent(String firstName,String lastName,String section);
	public List<Student> getAllStudent();
	public void updateStudent(int id,String section);
	public void deleteStudent(int id);
}
