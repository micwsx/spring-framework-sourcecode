package com.enjoy.model;

import org.springframework.stereotype.Component;

public class User {
	private String name;
	private String address;
	private Integer id;

	public User() {

	}

	public User(Integer id, String name, String address) {
		this.name = name;
		this.address = address;
		this.id = id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				", id=" + id +
				'}';
	}
}
