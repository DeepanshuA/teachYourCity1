package com.learning.learn_from_experts.model;

import java.util.List;

import com.learning.learn_from_experts.util.Subject;

public class Lecture {

	private final String teacherId;
	private final List<Student> studentId;
	private final long startTime;
	private final long endTime;
	private final Subject subject;

	public Lecture(String teacherId, List<Student> studentId, long startTime, long endTime, final Subject subject) {
		this.teacherId = teacherId;
		this.studentId = studentId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.subject = subject;
	}

	public String getTeacherId() {
		return teacherId;
	}
	public List<Student> getStudentId() {
		return studentId;
	}
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}

	public Subject getSubject() {
		return subject;
	}
	
}
