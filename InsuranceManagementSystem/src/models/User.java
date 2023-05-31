package models;

public class User {
private String userId;
private String name;
private String phone;
private String address;
private String email;
private String userType; 
private String policyId;
private boolean isPolicyActivated;

public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPolicyId() {
	return policyId;
}
public void setPolicyId(String policyId) {
	this.policyId = policyId;
}
public boolean isPolicyActivated() {
	return isPolicyActivated;
}
public void setPolicyActivated(boolean isPolicyActivated) {
	this.isPolicyActivated = isPolicyActivated;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", name=" + name + ", phone=" + phone + ", address=" + address + ", email="
			+ email + ", userType=" + userType + ", policyId=" + policyId + ", isPolicyActivated=" + isPolicyActivated
			+ "]";
}



}
