package com.learning.learn_from_experts.model;

import com.learning.learn_from_experts.util.Subject;

public class Teacher extends Person {

	private Subject subjectExpert;

	public Subject getSubjectExpert() {
		return subjectExpert;
	}

	public void setSubjectExpert(Subject subjectExpert) {
		this.subjectExpert = subjectExpert;
	}
	
	@Override
	public void setType(String type) {
		this.type = "Teacher";
	}
	
}
