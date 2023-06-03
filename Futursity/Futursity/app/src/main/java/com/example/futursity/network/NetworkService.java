package com.example.futursity.network;

import com.example.futursity.model.categories.CategoriesDataListResponse;
import com.example.futursity.model.categories.CategoryData;
import com.example.futursity.model.courses.CourseData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NetworkService {

    @GET("course/api/top_courses")
    Call<List<CourseData>> getCoursesList();

    @GET("course/api/categories")
    Call<List<CategoryData>> getCategoriesList();

}
