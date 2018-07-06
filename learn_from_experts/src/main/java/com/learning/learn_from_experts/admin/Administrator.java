package com.learning.learn_from_experts.admin;

import java.util.List;

import com.learning.learn_from_experts.model.Student;
import com.learning.learn_from_experts.model.Teacher;

public class Administrator {

	private List<Teacher> teachers;
	private List<Student> students;
	
	public Administrator(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
	}

	public void registerTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public void registerStudent(Student student) {
		students.add(student);
	}
	
}
