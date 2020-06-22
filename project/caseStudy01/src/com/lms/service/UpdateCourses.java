package com.lms.service;

import com.lms.model.Course;

@FunctionalInterface
public interface UpdateCourses {

	Course update(int courseId, String updateField);

}
