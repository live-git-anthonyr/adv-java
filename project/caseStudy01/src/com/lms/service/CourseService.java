package com.lms.service;

import java.util.HashMap;

import com.lms.model.Course;

public class CourseService {

	// Business Layer and CRUD operations
	private static HashMap<Integer, Course> ramDb = new HashMap<Integer, Course>();

	// CREATE - creates the course and adds it into a HashMap for random access
	public static Course createCourse(String department, int courseNumber, String title, String professor,
			int creditHrs, int capacity, boolean open) {
		Course course = new Course(department, courseNumber, title, professor, creditHrs, capacity, open);
		ramDb.put(course.getCourseId(), course);
		return course;
	}

	// READ - methods that print out a courses and course data
	public static Course displayCourse(int courseId) {
		if (ramDb.containsKey(courseId)) {
			System.out.println(ramDb.get(courseId).toString() + "\n");
			return ramDb.get(courseId);
		} else {
			System.out.println("\n\tEntry " + courseId + " could not be found.\n");
			return null;
		}
	}

	// uses double colon method reference tool for printing
	public static void displayAllCourses() {
		if (ramDb.isEmpty()) {
			System.out.println("\n\tThere is currently nothing to display");
		} else {
			ramDb.values().forEach(System.out::println);
			System.out.println();
		}
	}

	// UPDATE - method that takes a lambda variable and updates the respective field
	public static void updateCorse(int courseId, UpdateCourses updateField, String valueAsString) {
		updateField.update(courseId, valueAsString);
	}

	// Lambda variables to update each field in a Course
	public static UpdateCourses department = (int courseId, String department) -> {
		if (ramDb.containsKey(courseId)) {
			Course temp = ramDb.get(courseId);
			temp.setDepartment(department);
			return temp;
		} else {
			System.out.println("\n\tFailed to update\n\tCourse #" + courseId + " not found.");
			return null;
		}
	};
	public static UpdateCourses courseNumber = (int courseId, String courseNumberIntAsString) -> {
		if (ramDb.containsKey(courseId)) {
			Course temp = ramDb.get(courseId);
			temp.setCourseNumber(Integer.parseInt(courseNumberIntAsString));
			return temp;
		} else {
			System.out.println("\n\tFailed to update\n\tCourse #" + courseId + " not found.");
			return null;
		}
	};
	public static UpdateCourses title = (int courseId, String title) -> {
		if (ramDb.containsKey(courseId)) {
			Course temp = ramDb.get(courseId);
			temp.setTitle(title);
			return temp;
		} else {
			System.out.println("\n\tFailed to update\n\tCourse #" + courseId + " not found.");
			return null;
		}
	};
	public static UpdateCourses professor = (int courseId, String professor) -> {
		if (ramDb.containsKey(courseId)) {
			Course temp = ramDb.get(courseId);
			temp.setProfessor(professor);
			return temp;
		} else {
			System.out.println("\n\tFailed to update\n\tCourse #" + courseId + " not found.");
			return null;
		}
	};
	public static UpdateCourses creditHrs = (int courseId, String creditHrsIntAsString) -> {
		if (ramDb.containsKey(courseId)) {
			Course temp = ramDb.get(courseId);
			temp.setCreditHrs(Integer.parseInt(creditHrsIntAsString));
			return temp;
		} else {
			System.out.println("\n\tFailed to update\n\tCourse #" + courseId + " not found.");
			return null;
		}
	};
	public static UpdateCourses capacity = (int courseId, String capacityIntAsString) -> {
		if (ramDb.containsKey(courseId)) {
			Course temp = ramDb.get(courseId);
			temp.setCapacity(Integer.parseInt(capacityIntAsString));
			return temp;
		} else {
			System.out.println("\n\tFailed to update\n\tCourse #" + courseId + " not found.");
			return null;
		}
	};
	public static UpdateCourses openStatus = (int courseId, String isOpenBoolianAsString) -> {
		if (ramDb.containsKey(courseId)) {
			Course temp = ramDb.get(courseId);
			boolean isTrue = isOpenBoolianAsString.equalsIgnoreCase("true")
					|| isOpenBoolianAsString.equalsIgnoreCase("open") || isOpenBoolianAsString.equalsIgnoreCase("true");
			temp.setOpenStatus(isTrue);
			return temp;
		} else {
			System.out.println("\n\tFailed to update\n\tCourse #" + courseId + " not found.");
			return null;
		}
	};

	// DELETE - deletes course from HashMap
	public static Course deleteCourse(int courseId) {
		if (ramDb.containsKey(courseId)) {
			return ramDb.remove(courseId);
		} else {
			System.out.println("\n\tThere is no such entry in the collections database.");
			return null;
		}
	}

	// allows other classes to access the HashMap .put method
	public static void putInRamDb(Course course) {
		ramDb.put(course.getCourseId(), course);
	}

	// get method that returns all the course objects as an array
	public static Object[] getDataAsArray() {
		return ramDb.values().toArray();
	}

}
