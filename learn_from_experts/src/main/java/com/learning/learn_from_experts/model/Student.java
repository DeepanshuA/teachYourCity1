package com.learning.learn_from_experts.model;

import java.util.List;

import com.learning.learn_from_experts.util.Subject;

public class Student extends Person {

	private List<Teacher> teachers;
	
	public String getObject() {
		return type;
		
	}
	
	@Override
	public void setType(String type) {
		this.type = "Student";
	}

	public void joinTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public void joinSubject(Subject subject, Teacher teacher) {
		
	}
	
}
