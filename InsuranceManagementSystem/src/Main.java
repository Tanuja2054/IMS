import java.util.Scanner;

import user.Admin;
import user.Customer;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please Enter the type of user(C if Customer and A if Admin: )");
		char userType = scnr.next().charAt(0);
		switch(userType){
			case 'A':
				Admin.main(null);
//				Admin admin = new Admin();
//				admin.main();
				break;
				
			case 'C':
				Customer.main(null);
//				Customer customer = new Customer();
//				customer.main();
				break;
				
			default:
				System.out.println("Invalid User type. ");
		}
			
		

	}

}
