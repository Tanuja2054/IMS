package crud;

import java.util.ArrayList;

import models.User;

public class CrudUser {
	public ArrayList<User> addCategory(ArrayList<User> users, User User) {
		users.add(User);
		return users;
		
		
	}
	public void viewAllCategory(ArrayList<User> users ) {
		System.out.println("users: ");
		for (User user : users) {
			System.out.println(user.getUserId() + "     "
					+ user.getName() + "     " 
					+ user.getAddress() + "     "
					+ user.getPhone()	+ "     "
					+ user.getEmail() + "     "
					+ user.getUserType() + "     "
							);
		}
		
	}
	
	public void viewCategoryByID(ArrayList<User> users, String id) {
		System.out.println("User:");
		for (User user : users) {
			if(user.getUserId().equals(id)) {
				System.out.println(user.getUserId() + "     "
						+ user.getName() + "     " 
						+ user.getAddress() + "     "
						+ user.getPhone()	+ "     "
						+ user.getEmail() + "     "
						+ user.getUserType() + "     "
								);
				break;
			}
		}	
	}
	
	public ArrayList<User> updateCategoryByID(ArrayList<User> users, User Userupdate){
		for (User user : users) {
			if(user.getUserId().equals(Userupdate.getUserId())) {
				user = Userupdate;
				break;
			}
		}
		System.out.println("User is updated");
		return users;
	}
	
	public ArrayList<User> deleteCategorybyID(ArrayList<User> users, String UserId){
		for (User user : users) {
			if (user.getUserId().equals(UserId)){
				users.remove(user);
				break;
			}
		}
		System.out.println("User is deleted");
		return users;
		
	}

}
