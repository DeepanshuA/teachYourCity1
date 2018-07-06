package com.learning.learn_from_experts.model;

public abstract class Person {

	private String name;
	private String id;
	protected String type;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public abstract void setType(String type);

	String getId() {
		return id;
	}
	
	String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return getType() + " with name: " + getName() + " and Id: " + getId();
	}
}
