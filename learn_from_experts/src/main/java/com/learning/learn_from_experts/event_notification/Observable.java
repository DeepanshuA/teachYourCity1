package com.learning.learn_from_experts.event_notification;

import java.util.List;

import com.learning.learn_from_experts.model.Student;

public interface Observable {

	void notifyObservers(List<Student> students);
	
}
