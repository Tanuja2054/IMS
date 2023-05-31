package models;

import java.util.Date;

public class Policy {
private String policyNo;
private String policyName;
private String policyType;
private Double amount;
private Date startDate;
private Date endDate;

public String getPolicyNo() {
	return policyNo;
}
public void setPolicyNo(String policyNo) {
	this.policyNo = policyNo;
}
public String getPolicyName() {
	return policyName;
}
public void setPolicyName(String policyName) {
	this.policyName = policyName;
}
public String getPolicyType() {
	return policyType;
}
public void setPolicyType(String policyType) {
	this.policyType = policyType;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public Date getEndDate() {
	return endDate;
}
public void setEndDate(Date endDate) {
	this.endDate = endDate;
}
@Override
public String toString() {
	return "Policy [policyNo=" + policyNo + ", policyName=" + policyName + ", policyType=" + policyType + ", amount="
			+ amount + ", startDate=" + startDate + ", endDate=" + endDate + "]";
}




}
