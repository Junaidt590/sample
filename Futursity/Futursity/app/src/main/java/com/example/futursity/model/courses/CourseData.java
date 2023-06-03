package com.example.futursity.model.courses;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CourseData {

	@SerializedName("short_description")
	private String shortDescription;

	@SerializedName("total_enrollment")
	private int totalEnrollment;

	@SerializedName("shareable_link")
	private String shareableLink;

	@SerializedName("rating")
	private int rating;

	@SerializedName("description")
	private String description;

	@SerializedName("language")
	private String language;

	@SerializedName("section")
	private String section;

	@SerializedName("title")
	private String title;

	@SerializedName("meta_keywords")
	private String metaKeywords;

	@SerializedName("discounted_price")
	private String discountedPrice;

	@SerializedName("is_admin")
	private String isAdmin;

	@SerializedName("video_url")
	private String videoUrl;

	@SerializedName("category_id")
	private String categoryId;

	@SerializedName("course_overview_provider")
	private String courseOverviewProvider;

	@SerializedName("outcomes")
	private List<Object> outcomes;

	@SerializedName("sub_category_id")
	private String subCategoryId;

	@SerializedName("price")
	private String price;

	@SerializedName("id")
	private String id;

	@SerializedName("last_modified")
	private String lastModified;

	@SerializedName("requirements")
	private List<Object> requirements;

	@SerializedName("thumbnail")
	private String thumbnail;

	@SerializedName("discount_flag")
	private Object discountFlag;

	@SerializedName("visibility")
	private Object visibility;

	@SerializedName("level")
	private String level;

	@SerializedName("is_free_course")
	private Object isFreeCourse;

	@SerializedName("is_top_course")
	private String isTopCourse;

	@SerializedName("external_link")
	private String externalLink;

	@SerializedName("date_added")
	private String dateAdded;

	@SerializedName("meta_description")
	private String metaDescription;

	@SerializedName("external")
	private String external;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("number_of_ratings")
	private int numberOfRatings;

	@SerializedName("video_count")
	private String videoCount;

	@SerializedName("instructor_name")
	private String instructorName;

	@SerializedName("full_price")
	private String fullPrice;

	@SerializedName("status")
	private String status;

	public CourseData(String shortDescription, int totalEnrollment, String shareableLink, int rating, String description, String language, String section, String title, String metaKeywords, String discountedPrice, String isAdmin, String videoUrl, String categoryId, String courseOverviewProvider, List<Object> outcomes, String subCategoryId, String price, String id, String lastModified, List<Object> requirements, String thumbnail, Object discountFlag, Object visibility, String level, Object isFreeCourse, String isTopCourse, String externalLink, String dateAdded, String metaDescription, String external, String userId, int numberOfRatings, String videoCount, String instructorName, String fullPrice, String status) {
		this.shortDescription = shortDescription;
		this.totalEnrollment = totalEnrollment;
		this.shareableLink = shareableLink;
		this.rating = rating;
		this.description = description;
		this.language = language;
		this.section = section;
		this.title = title;
		this.metaKeywords = metaKeywords;
		this.discountedPrice = discountedPrice;
		this.isAdmin = isAdmin;
		this.videoUrl = videoUrl;
		this.categoryId = categoryId;
		this.courseOverviewProvider = courseOverviewProvider;
		this.outcomes = outcomes;
		this.subCategoryId = subCategoryId;
		this.price = price;
		this.id = id;
		this.lastModified = lastModified;
		this.requirements = requirements;
		this.thumbnail = thumbnail;
		this.discountFlag = discountFlag;
		this.visibility = visibility;
		this.level = level;
		this.isFreeCourse = isFreeCourse;
		this.isTopCourse = isTopCourse;
		this.externalLink = externalLink;
		this.dateAdded = dateAdded;
		this.metaDescription = metaDescription;
		this.external = external;
		this.userId = userId;
		this.numberOfRatings = numberOfRatings;
		this.videoCount = videoCount;
		this.instructorName = instructorName;
		this.fullPrice = fullPrice;
		this.status = status;
	}

	public String getShortDescription(){
		return shortDescription;
	}

	public int getTotalEnrollment(){
		return totalEnrollment;
	}

	public String getShareableLink(){
		return shareableLink;
	}

	public int getRating(){
		return rating;
	}

	public String getDescription(){
		return description;
	}

	public String getLanguage(){
		return language;
	}

	public String getSection(){
		return section;
	}

	public String getTitle(){
		return title;
	}

	public String getMetaKeywords(){
		return metaKeywords;
	}

	public String getDiscountedPrice(){
		return discountedPrice;
	}

	public String getIsAdmin(){
		return isAdmin;
	}

	public String getVideoUrl(){
		return videoUrl;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public String getCourseOverviewProvider(){
		return courseOverviewProvider;
	}

	public List<Object> getOutcomes(){
		return outcomes;
	}

	public String getSubCategoryId(){
		return subCategoryId;
	}

	public String getPrice(){
		return price;
	}

	public String getId(){
		return id;
	}

	public String getLastModified(){
		return lastModified;
	}

	public List<Object> getRequirements(){
		return requirements;
	}

	public String getThumbnail(){
		return thumbnail;
	}

	public Object getDiscountFlag(){
		return discountFlag;
	}

	public Object getVisibility(){
		return visibility;
	}

	public String getLevel(){
		return level;
	}

	public Object getIsFreeCourse(){
		return isFreeCourse;
	}

	public String getIsTopCourse(){
		return isTopCourse;
	}

	public String getExternalLink(){
		return externalLink;
	}

	public String getDateAdded(){
		return dateAdded;
	}

	public String getMetaDescription(){
		return metaDescription;
	}

	public String getExternal(){
		return external;
	}

	public String getUserId(){
		return userId;
	}

	public int getNumberOfRatings(){
		return numberOfRatings;
	}

	public String getVideoCount(){
		return videoCount;
	}

	public String getInstructorName(){
		return instructorName;
	}

	public String getFullPrice(){
		return fullPrice;
	}

	public String getStatus(){
		return status;
	}
}