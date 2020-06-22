package com.lms.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Course implements Serializable {

	private static int id = 0;
	private int courseId, courseNumber, creditHrs, capacity;
	private String department, title, professor;
	private boolean openStatus;

	public Course(String department, int courseNumber, String title, String professor, int creditHrs, int capacity,
			boolean isOpen) {
		this.courseId = id + 1000;
		this.courseNumber = courseNumber;
		this.creditHrs = creditHrs;
		this.capacity = capacity;
		this.department = department;
		this.title = title;
		this.professor = professor;
		this.openStatus = isOpen;
		id++;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Course.id = id;
	}

	public int getCourseId() {
		return courseId;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public int getCreditHrs() {
		return creditHrs;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getDepartment() {
		return department;
	}

	public String getTitle() {
		return title;
	}

	public String getProfessor() {
		return professor;
	}

	public boolean isOpen() {
		return openStatus;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public void setCreditHrs(int creditHrs) {
		this.creditHrs = creditHrs;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public void setOpenStatus(boolean isOpen) {
		this.openStatus = isOpen;
	}

	@Override
	public String toString() {
		String bool = "closed";
		if (openStatus) {
			bool = "open";
		}
		return "Course " + courseId + " [" + department + " " + courseNumber + " " + title + " (Professor: " + professor
				+ ", Credit Hours: " + creditHrs + ", Capacity: " + capacity + ", Status: " + bool + ")]";
	}
}
