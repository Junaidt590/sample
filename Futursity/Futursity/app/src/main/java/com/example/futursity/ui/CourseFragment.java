package com.example.futursity.ui;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.futursity.R;
import com.example.futursity.adapter.CategoryAdapter;
import com.example.futursity.adapter.CourseAdapter;
import com.example.futursity.model.categories.CategoriesDataListResponse;
import com.example.futursity.model.categories.CategoryData;
import com.example.futursity.model.courses.CourseData;
import com.example.futursity.model.courses.CoursesDataListResponse;
import com.example.futursity.network.NetworkService;
import com.example.futursity.network.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CourseFragment extends Fragment {

    RecyclerView recyclerCourses, recyclerCategories;
    CourseAdapter courseAdapter;
    CategoryAdapter categoryAdapter;
    ProgressDialog progressDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_course, container, false);

        initViews(view);
        getCoursesList();

        return view;
    }

    private void initViews(View v) {
        recyclerCourses = v.findViewById(R.id.recyclerCourses);
        recyclerCategories = v.findViewById(R.id.recyclerCategories);
    }

    private void getCoursesList() {
        progressDialog = new ProgressDialog(requireContext());
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        NetworkService service = RetrofitClient.getRetrofitInstance().create(NetworkService.class);
        Call<List<CourseData>> call = service.getCoursesList();
        call.enqueue(new Callback<List<CourseData>>() {
            @Override
            public void onResponse(Call<List<CourseData>> call, Response<List<CourseData>> response) {
                if (response.body() != null) {
                    setCoursesList(response.body());
                }
                getCategoriesList();
            }

            @Override
            public void onFailure(Call<List<CourseData>> call, Throwable t) {
                progressDialog.dismiss();
                Log.d("TEST111", t.getMessage());
                Toast.makeText(requireContext(), "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getCategoriesList() {
        NetworkService service = RetrofitClient.getRetrofitInstance().create(NetworkService.class);
        Call<List<CategoryData>> call = service.getCategoriesList();
        call.enqueue(new Callback<List<CategoryData>>() {
            @Override
            public void onResponse(Call<List<CategoryData>> call, Response<List<CategoryData>> response) {
                progressDialog.dismiss();
                if (response.body() != null) {
                    setCategoriesList(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<CategoryData>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(requireContext(), "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setCoursesList(List<CourseData> coursesList) {
        courseAdapter = new CourseAdapter(coursesList, requireContext());
        recyclerCourses.setAdapter(courseAdapter);
    }

    private void setCategoriesList(List<CategoryData> categoriesList) {
        categoryAdapter = new CategoryAdapter(categoriesList);
        recyclerCategories.setAdapter(categoryAdapter);
    }
}