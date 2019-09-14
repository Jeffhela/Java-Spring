package com.codingdojo.model;

public class Student {
	
	private Long id;
	private String name;
	private String githubUsername;
	private String favoriteFood;
	private Object firstName;
	private Object lastName;
	private Object age;

	public Student(Long id, String name, String githubUsername, String string) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Student(long id2, String name2, String githubUsername2, String string) {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public String getfirstName() {
		return (String) firstName;
	}

	public String getlastName() {
		return (String) lastName;
	}

	public int getage() {
		return (int) age;
	}

}