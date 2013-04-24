/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop1.pro7.mvc.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gvargas
 */
public class Student {

    private int     studentId;
    private String  firstName;
    private String  lastName;
    private String  email;    
    private String  status;  // student can be enable or disable 
    private Date    createdDate;        
    private String  address;
    
    private String  addressCity;
    private String  addressState;
    private String  addressZipCode;
    private String  addressCountry;
    private String  phoneHome;
    private String  phoneMobile;

    public Student() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public String getAddressZipCode() {
        return addressZipCode;
    }

    public void setAddressZipCode(String addressZipCode) {
        this.addressZipCode = addressZipCode;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", status=" + status + ", createdDate=" + createdDate + ", address=" + address + ", addressCity=" + addressCity + ", addressState=" + addressState + ", addressZipCode=" + addressZipCode + ", addressCountry=" + addressCountry + ", phoneHome=" + phoneHome + ", phoneMobile=" + phoneMobile + '}';
    }
    
    
    
    


    
    
    
    

}
