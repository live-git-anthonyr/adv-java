package com.lms;

import com.lms.repository.CourseRepo;
import com.lms.service.CourseService;

public class LMSApp {

	public static void main(String[] args) {

		// FETCH
		System.out.print("FETCH");
		CourseRepo.loadCourses();

		// CREATE
//		CourseService.createCourse("CSC", 171, "Intro to Programming", "T.Pawlicki", 4, 120, true);
//		CourseService.createCourse("CSC", 172, "Data Structures", "T.Pawlicki", 4, 75, true);
//		CourseService.createCourse("CSC", 204, "Artificial Intelligence", "G.Ferguson", 4, 120, false);
//		CourseService.createCourse("CSC", 212, "Human Computer Interaction", "E.Hoque", 6, 105, false);
//		CourseService.createCourse("CSC", 174, "Advanced Web Development", "R.Kostin", 4, 35, true);
//
//		CourseService.createCourse("JPN", 101, "Beginner Japanese I", "S.Hardy", 8, 60, true);
//		CourseService.createCourse("JPN", 102, "Beginner Japanese II", "S.Hardy", 8, 60, false);
//		CourseService.createCourse("JPN", 202, "Intermediate Japanese I", "M.Tamate", 8, 45, true);
//		CourseService.createCourse("JPN", 202, "Intermediate Japanese II", "M.Tamate", 8, 45, false);
//		CourseService.createCourse("JPN", 114, "Conversational Japanese", "S.Hardy", 2, 18, true);
//
//		CourseService.createCourse("DAN", 172, "Breaking & Hip Hop Dance Culture", "Jonny", 2, 28, true);
//
//		CourseService.createCourse("LIN", 102, "Intro to Linguistics", "Tammy", 4, 75, true);
//		CourseService.createCourse("LIN", 222, "Syntax Structures", "Tammy", 4, 75, true);
//		CourseService.createCourse("LIN", 172, "Data Science for Linguistics", "Tammy", 4, 75, false);

		// READ
//		System.out.println("CREATE & READ");
		CourseService.displayCourse(1005);
		CourseService.displayAllCourses();

		// UPDATE
//		System.out.println("UPDATE");
//		CourseService.displayCourse(1013);
//		CourseService.updateCorse(1013, CourseService.department, "CSC/LIN");
//		CourseService.updateCorse(1013, CourseService.courseNumber, "501");
//		CourseService.updateCorse(1013, CourseService.title, "Data Science for Linguistic Studies");
//		CourseService.updateCorse(1013, CourseService.professor, "Maya");
//		CourseService.updateCorse(1013, CourseService.creditHrs, "6");
//		CourseService.updateCorse(1013, CourseService.capacity, "30");
//		CourseService.updateCorse(1013, CourseService.openStatus, "true");
//		CourseService.displayCourse(1013);

		// DELETE
//		System.out.println("DELETE");
//		CourseService.deleteCourse(1000);
//		CourseService.deleteCourse(1001);
//		CourseService.deleteCourse(1009);
//		CourseService.displayAllCourses();

		// SAVE
		CourseRepo.saveCourses();

	}

}
