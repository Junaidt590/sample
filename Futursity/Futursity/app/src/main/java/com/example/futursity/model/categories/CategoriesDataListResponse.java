package com.example.futursity.model.categories;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CategoriesDataListResponse {

	@SerializedName("CategoriesDataResponse")
	private List<CategoryData> categoriesDataResponse;

	public CategoriesDataListResponse(List<CategoryData> categoriesDataResponse) {
		this.categoriesDataResponse = categoriesDataResponse;
	}

	public List<CategoryData> getCategoriesDataResponse(){
		return categoriesDataResponse;
	}
}