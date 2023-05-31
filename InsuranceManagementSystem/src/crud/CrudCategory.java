package crud;
import java.util.ArrayList;

import models.Category;

public class CrudCategory {
	
	public ArrayList<Category> addCategory(ArrayList<Category> categories, Category category) {
		categories.add(category);
		return categories;
		
		
	}
	public void viewAllCategory(ArrayList<Category> categories ) {
		System.out.println("Categories: ");
		for (Category category : categories) {
			System.out.println(category.getCategoryId() + "     "
					+ category.getName() + "     " 
					+ category.getDescription());
		}
		
	}
	
	public void viewCategoryByID(ArrayList<Category> categories, String id) {
		System.out.println("Category:");
		for (Category category : categories) {
			if(category.getCategoryId().equals(id)) {
				System.out.println(category.getCategoryId() + "     "
						+ category.getName() + "     " 
						+ category.getDescription());
				break;
			}
		}	
	}
	
	public ArrayList<Category> updateCategoryByID(ArrayList<Category> categories, Category categoryupdate){
		for (Category category : categories) {
			if(category.getCategoryId().equals(categoryupdate.getCategoryId())) {
				categories.set(categories.indexOf(category),categoryupdate);
				category = categoryupdate;
				break;
			}
		}
		System.out.println("Category is updated");
		return categories;
	}
	
	public ArrayList<Category> deleteCategorybyID(ArrayList<Category> categories, String categoryID){
		for (Category category : categories) {
			if (category.getCategoryId().equals(categoryID)){
				categories.remove(category);
				break;
			}
		}
		System.out.println("Category is deleted");
		return categories;
		
	}

}
