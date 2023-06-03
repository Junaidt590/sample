package com.example.futursity.model.courses;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CoursesDataListResponse {

	@SerializedName("CoursesDataResponse")
	private List<CourseData> coursesDataResponse;

	public CoursesDataListResponse(List<CourseData> coursesDataResponse) {
		this.coursesDataResponse = coursesDataResponse;
	}

	public List<CourseData> getCoursesDataResponse(){
		return coursesDataResponse;
	}
}