package com.cognixia.jump.fullstack.advanced.streams;

import java.io.Serializable;

class Person implements Serializable {
	private int id;
	private int age;
	private float salary;

	public Person(int id, int age, float salary) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public float getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", salary=" + salary + "]";
	}

}
