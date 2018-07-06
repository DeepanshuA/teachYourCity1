package com.learning.learn_from_experts.event_notification;

import java.util.List;

import com.learning.learn_from_experts.model.Lecture;

public interface Observer {

	void update(List<Lecture> lectures);
	
}
