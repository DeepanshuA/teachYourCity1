package com.learning.learn_from_experts.admin;

import com.learning.learn_from_experts.event_notification.Observable;
import com.learning.learn_from_experts.model.Student;
import com.learning.learn_from_experts.model.Teacher;

public interface IAdministrator extends Observable {

	void registerTeacher(Teacher teacher);
	void removeTeacher(String teacherId);
	void registerStudent(Student studentId);
	void removeStudent(String studentId);
	void assignLecture();
	
}
