package com.staff.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee {

	
	private int id;
	private String name;
	private int age;
	private String profile;
	private int experience;
	private long salary;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", profile=" + profile + ", experience="
				+ experience + ", salary=" + salary + "]";
	}
	
	
	
	
}
