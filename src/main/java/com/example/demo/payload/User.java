package com.example.demo.payload;

public class User {

	private int id;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String lastName ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", lastName='" + lastName + '\'' + '}';
	}
}
