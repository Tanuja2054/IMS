package crud;

import java.util.ArrayList;

import models.Policy;

public class CrudPolicy {
	
	public ArrayList<Policy> addPolicy(ArrayList<Policy> policies, Policy Policy) {
		policies.add(Policy);
		return policies;
		
		
	}
	public void viewAllPolicies(ArrayList<Policy> policies ) {
		System.out.println("Policies: ");
		for (Policy policy : policies) {
			System.out.println(policy.getPolicyNo() + "     "
					+ policy.getPolicyName() + "     " 
					+ policy.getPolicyType() + "     "
					+ policy.getStartDate()	+ "     "
					+ policy.getEndDate() + "     "
					+ policy.getAmount() + "     "
							);
		}
		
	}
	
	public void viewPolicyByID(ArrayList<Policy> policies, String id) {
		System.out.println("policy:");
		for (Policy policy : policies) {
			if(policy.getPolicyNo().equals(id)) {
				System.out.println(policy.getPolicyNo() + "     "
						+ policy.getPolicyName() + "     " 
						+ policy.getPolicyType() + "     "
						+ policy.getStartDate()	+ "     "
						+ policy.getEndDate() + "     "
						+ policy.getAmount() + "     "
								);
				break;
			}
		}	
	}
	
	public ArrayList<Policy> updatePolicyByID(ArrayList<Policy> policies, Policy policyupdate){
		for (Policy policy : policies) {
			if(policy.getPolicyNo().equals(policyupdate.getPolicyNo())) {
				policies.set(policies.indexOf(policy), policyupdate);
//				policy = policyupdate;
				break;
			}
		}
		System.out.println("Policy is updated");
		return policies;
	}
	
	public ArrayList<Policy> deletePolicybyID(ArrayList<Policy> policies, String policyNo){
		for (Policy policy : policies) {
			if (policy.getPolicyNo().equals(policyNo)){
				policies.remove(policy);
				break;
			}
		}
		System.out.println("Policy is deleted");
		return policies;
		
	}

}
