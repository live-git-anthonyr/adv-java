package com.lms.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.lms.model.Course;
import com.lms.service.CourseService;

public class CourseRepo {

	// LMS Persistence Layer
	private static File dBFile = new File("lmsDatabase.dat");

	// SAVE - writes courses to file output
	public static void saveCourses() {
		// dBFile.delete();
		FileOutputStream outputStream;
		ObjectOutputStream objOutStream;
		try {
			// dBFile = new File("lmsDatabase.dat");
			outputStream = new FileOutputStream(dBFile);
			objOutStream = new ObjectOutputStream(outputStream);
			objOutStream.writeObject(CourseService.getDataAsArray());
			objOutStream.close();
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// FETCH - reads courses from database file and puts them into the HashMap
	public static void loadCourses() {
		FileInputStream inputStream;
		ObjectInputStream objInStream;
		Object[] courseList = null;
		// all course IDs are tracked with a static variable
		int idCount = 0;

		try {
			System.out.println(" - reading data from " + dBFile.toString() + "\n");
			inputStream = new FileInputStream(dBFile);
			objInStream = new ObjectInputStream(inputStream);
			courseList = (Object[]) objInStream.readObject();
			objInStream.close();
			inputStream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (Object course : courseList) {
			if (((Course) course).getCourseId() > idCount) {
				idCount = ((Course) course).getCourseId();
			}
			CourseService.putInRamDb((Course) course);
		}
		// reseting the static variable to track the unique ID for Courses
		Course.setId(idCount - 1000);
	}

	public static File getdBFile() {
		return dBFile;
	}

}
