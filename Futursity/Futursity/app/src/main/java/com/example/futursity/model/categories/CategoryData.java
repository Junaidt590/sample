package com.example.futursity.model.categories;

import com.google.gson.annotations.SerializedName;

public class CategoryData {

	@SerializedName("parent")
	private String parent;

	@SerializedName("date_added")
	private String dateAdded;

	@SerializedName("thumbnail")
	private String thumbnail;

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("last_modified")
	private String lastModified;

	@SerializedName("number_of_courses")
	private int numberOfCourses;

	@SerializedName("slug")
	private String slug;

	@SerializedName("font_awesome_class")
	private String fontAwesomeClass;

	@SerializedName("order")
	private String order;

	public CategoryData(String parent, String dateAdded, String thumbnail, String code, String name, String id, String lastModified, int numberOfCourses, String slug, String fontAwesomeClass, String order) {
		this.parent = parent;
		this.dateAdded = dateAdded;
		this.thumbnail = thumbnail;
		this.code = code;
		this.name = name;
		this.id = id;
		this.lastModified = lastModified;
		this.numberOfCourses = numberOfCourses;
		this.slug = slug;
		this.fontAwesomeClass = fontAwesomeClass;
		this.order = order;
	}

	public String getParent(){
		return parent;
	}

	public String getDateAdded(){
		return dateAdded;
	}

	public String getThumbnail(){
		return thumbnail;
	}

	public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public String getLastModified(){
		return lastModified;
	}

	public int getNumberOfCourses(){
		return numberOfCourses;
	}

	public String getSlug(){
		return slug;
	}

	public String getFontAwesomeClass(){
		return fontAwesomeClass;
	}

	public String getOrder(){
		return order;
	}
}