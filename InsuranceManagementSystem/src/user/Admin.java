package user;

import java.util.ArrayList;
import java.util.Scanner;

import crud.CrudCategory;
import crud.CrudPolicy;
import crud.CrudSubCategory;
import models.Category;
import models.Policy;
import models.SubCategory;

public class Admin {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Category> categories = new ArrayList<Category>();
		CrudCategory crudCategory = new CrudCategory();
		ArrayList<SubCategory> subCategories = new ArrayList<SubCategory>();
		CrudSubCategory crudSubCategory = new CrudSubCategory();
		ArrayList<Policy> policies = new ArrayList<Policy>();
		CrudPolicy crudPolicy = new CrudPolicy();
		
		System.out.println("What do you wanna do?");
		System.out.println("1. Add Category");
		System.out.println("2. View Category");
		System.out.println("3. Update Category");
		System.out.println("4. Delete Category");
		
		System.out.println("5. Add Sub-Category");
		System.out.println("6. View Sub-Category");
		System.out.println("7. Update SUb-Category");
		System.out.println("8. Delete Sub-Category");
		
		System.out.println("9. Add Policy");
		System.out.println("10. View Policy");
		System.out.println("11. Update Policy");
		System.out.println("12. Delete Policy");
		
		char repeat = 'Y';
		while(repeat == 'Y') {
		System.out.println("Select a choice number: ");
		int choice = scnr.nextInt();
		
		switch(choice){
			case 1:
				Category category = new Category();
				System.out.println("Enter Category ID: ");
				category.setCategoryId(scnr.next());
				System.out.println("Enter Category Name: ");
				category.setName(scnr.next());
				System.out.println("Enter Category Description: ");
				category.setDescription(scnr.next());
				crudCategory.addCategory(categories, category);
				break;
				
			case 2:
				crudCategory.viewAllCategory(categories);
				break;
				
			case 3:
				Category categoryUpdate = new Category();
				System.out.println("Enter Category ID: ");
				categoryUpdate.setCategoryId(scnr.next());
				System.out.println("Enter Category Name: ");
				categoryUpdate.setName(scnr.next());
				System.out.println("Enter Category Description: ");
				categoryUpdate.setDescription(scnr.next());
				categories = crudCategory.updateCategoryByID(categories, categoryUpdate);
				break;
				
			case 4:
				System.out.println("Eneter Category ID: ");
				String catID = scnr.next();
				categories = crudCategory.deleteCategorybyID(categories, catID);
				
				
			case 5:
				SubCategory subCategory = new SubCategory();
				System.out.println("Enter Sub Category ID: ");
				subCategory.setSubCategoryId(scnr.next());
				System.out.println("Enter Sub Category Name: ");
				subCategory.setName(scnr.next());
				System.out.println("Enter Category Description: ");
				subCategory.setDescription(scnr.next());
				crudSubCategory.addSubCategory(subCategories, subCategory);
				break;
				
			case 6:
				crudSubCategory.viewAllSubCategory(subCategories);
				break;
				
			case 7:
				SubCategory subCategoryUpdate = new SubCategory();
				System.out.println("Enter Category ID: ");
				subCategoryUpdate.setSubCategoryId(scnr.next());
				System.out.println("Enter Category Name: ");
				subCategoryUpdate.setName(scnr.next());
				System.out.println("Enter Category Description: ");
				subCategoryUpdate.setDescription(scnr.next());
				System.out.println("Enter Category ID: ");
				subCategoryUpdate.setCategoryId(scnr.next());
				subCategories = crudSubCategory.updateSubCategoryByID(subCategories, subCategoryUpdate);
				break;
				
			case 8:
				System.out.println("Eneter Category ID: ");
				String subCatID = scnr.next();
				categories = crudCategory.deleteCategorybyID(categories, subCatID);
				
				//Policy
				
			case 9:
				Policy policy = new Policy();
				System.out.println("Enter Policy no: ");
				policy.setPolicyNo(scnr.next());
				System.out.println("Enter Policy Name: ");
				policy.setPolicyName(scnr.next());
				System.out.println("Enter Policy type: ");
				policy.setPolicyType(scnr.next());
				System.out.println("Enter Policy amount: ");
				policy.setAmount(scnr.nextDouble());
//				policy.setStartDate(scnr.next().);
				crudPolicy.addPolicy(policies, policy);
				break;
				
			case 10:
				crudPolicy.viewAllPolicies(policies);
				break;
				
			case 11:
				Policy policyUpdate = new Policy();
				System.out.println("Enter Policy no: ");
				policyUpdate.setPolicyNo(scnr.next());
				System.out.println("Enter Policy Name: ");
				policyUpdate.setPolicyName(scnr.next());
				System.out.println("Enter Policy type: ");
				policyUpdate.setPolicyType(scnr.next());
				System.out.println("Enter Policy amount: ");
				policyUpdate.setAmount(scnr.nextDouble());
				policies = crudPolicy.updatePolicyByID(policies, policyUpdate);
				break;
				
			case 12:
				System.out.println("Eneter Policy No: ");
				String policyNo = scnr.next();
				policies = crudPolicy.deletePolicybyID(policies, policyNo);
		
			default:
				System.out.println("Invalid Choice");
				break;
				
				
		}
		
		System.out.println("Do you want to continue?(Enter Y to continue): ");
		repeat = scnr.next().charAt(0);
	}
	}
}
