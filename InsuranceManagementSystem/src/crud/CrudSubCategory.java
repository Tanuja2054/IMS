package crud;

import java.util.ArrayList;

import models.SubCategory;


public class CrudSubCategory {
	public ArrayList<SubCategory> addSubCategory(ArrayList<SubCategory> subCategories, SubCategory subCategory) {
		subCategories.add(subCategory);
		return subCategories;
		
		
	}
	public void viewAllSubCategory(ArrayList<SubCategory> subCategories ) {
		System.out.println("Categories: ");
		for (SubCategory subCategory : subCategories) {
			System.out.println(subCategory.getSubCategoryId() + "     "
					+ subCategory.getCategoryId() + "     "
					+ subCategory.getName() + "     " 
					+ subCategory.getDescription());
		}
		
	}
	
	public void viewSubCategoryByID(ArrayList<SubCategory> subCategories, String id) {
		System.out.println("Category:");
		for (SubCategory subCategory : subCategories) {
			if(subCategory.getSubCategoryId().equals(id)) {
				System.out.println(subCategory.getSubCategoryId() + "     "
						+ subCategory.getCategoryId() + "     "
						+ subCategory.getName() + "     " 
						+ subCategory.getDescription());
				break;
			}
		}	
	}
	
	public ArrayList<SubCategory> updateSubCategoryByID(ArrayList<SubCategory> subCategories, SubCategory subCategoryupdate){
		for (SubCategory subCategory : subCategories) {
			if(subCategory.getSubCategoryId().equals(subCategoryupdate.getSubCategoryId())) {
				subCategories.set(subCategories.indexOf(subCategory), subCategoryupdate);
//				subCategory = subCategoryupdate;
				break;
			}
		}
		System.out.println("Category is updated");
		return subCategories;
	}
	
	public ArrayList<SubCategory> deleteSubCategorybyID(ArrayList<SubCategory> subCategories, String subCategoryID){
		for (SubCategory subCategory : subCategories) {
			if (subCategory.getSubCategoryId().equals(subCategoryID)){
				subCategories.remove(subCategory);
				break;
			}
		}
		System.out.println("Category is deleted");
		return subCategories;
		
	}
}
