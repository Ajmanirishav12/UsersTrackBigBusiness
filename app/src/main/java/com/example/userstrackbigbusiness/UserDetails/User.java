package com.example.userstrackbigbusiness.UserDetails;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String emailId;
    private String phoneNumber;
    private String dateOfJoining;
    private User setToBeDisplayed;
    private int EmployeeCount;

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    private String profileImage;

    private String businessName, businessType, businessAddressLine1, businessAddressLine2, gstIn, state, pincode;
    private boolean isLoggedIn;
    private String bankName, bankBranch, bankIfscCode, bankAccountNumber, beneficiaryName, upId;
    private String termsAndConditions = "*This is an electronic generated invoice.";

    public User() {

    }

    public User(String name, String emailId, String phoneNumber, String businessName, String businessType, String businessAddressLine1, String businessAddressLine2, String gstIn, String dateOfJoining) {
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.businessName = businessName;
        this.businessType = businessType;
        this.businessAddressLine1 = businessAddressLine1;
        this.businessAddressLine2 = businessAddressLine2;
        this.gstIn = gstIn;
        this.dateOfJoining = dateOfJoining;
    }

    public User(String name, String emailId, String phoneNumber, String businessName, String businessType, String businessAddressLine1, String businessAddressLine2, String gstIn, String state, String pincode, String dateOfJoining) {
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.businessName = businessName;
        this.businessType = businessType;
        this.businessAddressLine1 = businessAddressLine1;
        this.businessAddressLine2 = businessAddressLine2;
        this.gstIn = gstIn;
        this.state = state;
        this.pincode = pincode;
        this.dateOfJoining = dateOfJoining;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public String getBusinessAddressLine1() {
        return businessAddressLine1;
    }

    public void setBusinessAddressLine1(String businessAddressLine1) {
        this.businessAddressLine1 = businessAddressLine1;
    }

    public String getBusinessAddressLine2() {
        return businessAddressLine2;
    }

    public void setBusinessAddressLine2(String businessAddressLine2) {
        this.businessAddressLine2 = businessAddressLine2;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getGstIn() {
        return gstIn;
    }

    public void setGstIn(String gstIn) {
        this.gstIn = gstIn;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getBankIfscCode() {
        return bankIfscCode;
    }

    public void setBankIfscCode(String bankIfscCode) {
        this.bankIfscCode = bankIfscCode;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public String getUpId() {
        return upId;
    }

    public void setUpId(String upId) {
        this.upId = upId;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }
    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }
    public void setToBeDisplayed(User setToBeDisplayed){
        this.setToBeDisplayed = setToBeDisplayed;
    }
    public  User getSetToBeDisplayed(){
        return  setToBeDisplayed;
    }

    public void setEmployeeCount(int EmployeeCount) {
     this.EmployeeCount = EmployeeCount;
    }
    public int getemployeeCount()
    {
        return EmployeeCount;
    }
}
