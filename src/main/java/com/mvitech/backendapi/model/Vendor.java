package com.mvitech.backendapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendor {
    private int vendorId;
    private String vendorName;
    private String address1;
    private String address2;
    private String vendorCity;
    private String vendorState;
    private String vendorZipCode;
    private String vendorPhone;
    private String VendorContactLastName;
    private String VendorContactFirstName;
    private int defaultTermsId;
    private int accountNumber;

    public Vendor() {
    }

    public Vendor(int vendorId,
                  String vendorName,
                  String address1, String address2,
                  String vendorCity,
                  String vendorState,
                  String vendorZipCode,
                  String vendorPhone,
                  String vendorContactLastName,
                  String vendorContactFirstName,
                  int defaultTermsId,
                  int accountNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.address1 = address1;
        this.address2 = address2;
        this.vendorCity = vendorCity;
        this.vendorState = vendorState;
        this.vendorZipCode = vendorZipCode;
        this.vendorPhone = vendorPhone;
        VendorContactLastName = vendorContactLastName;
        VendorContactFirstName = vendorContactFirstName;
        this.defaultTermsId = defaultTermsId;
        this.accountNumber = accountNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getVendorCity() {
        return vendorCity;
    }

    public void setVendorCity(String vendorCity) {
        this.vendorCity = vendorCity;
    }

    public String getVendorState() {
        return vendorState;
    }

    public void setVendorState(String vendorState) {
        this.vendorState = vendorState;
    }

    public String getVendorZipCode() {
        return vendorZipCode;
    }

    public void setVendorZipCode(String vendorZipCode) {
        this.vendorZipCode = vendorZipCode;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

    public String getVendorContactLastName() {
        return VendorContactLastName;
    }

    public void setVendorContactLastName(String vendorContactLastName) {
        VendorContactLastName = vendorContactLastName;
    }

    public String getVendorContactFirstName() {
        return VendorContactFirstName;
    }

    public void setVendorContactFirstName(String vendorContactFirstName) {
        VendorContactFirstName = vendorContactFirstName;
    }

    public int getDefaultTermsId() {
        return defaultTermsId;
    }

    public void setDefaultTermsId(int defaultTermsId) {
        this.defaultTermsId = defaultTermsId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
