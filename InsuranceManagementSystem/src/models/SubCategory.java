package models;

public class SubCategory {
	private String subCategoryId;
	private String categoryId;
	private String name;
	private String description;
	public String getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + subCategoryId + ", categoryId=" + categoryId + ", name=" + name
				+ ", description=" + description + "]";
	}
	
	

}
