package com.mvitech.backendapi.model;

import javax.persistence.*;

@Entity
@Table(name = "vendors")
public class Vendor {


    private Integer id;
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



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vendor_id")
    public Integer getId() {
        return id;
    }
    @Column(name="vendor_id")
    public void setId(Integer vendorId) {
        this.id = vendorId;
    }

    @Column(name="vendor_name")
    public String getVendorName() {
        return vendorName;
    }
    @Column(name="vendor_name")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    @Column(name="vendor_address1")
    public String getAddress1() {
        return address1;
    }
    @Column(name="vendor_address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    @Column(name="vendor_address2")
    public String getAddress2() {
        return address2;
    }
    @Column(name="vendor_address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    @Column(name="vendor_city")
    public String getVendorCity() {
        return vendorCity;
    }
    @Column(name="vendor_city")
    public void setVendorCity(String vendorCity) {
        this.vendorCity = vendorCity;
    }
    @Column(name="vendor_state")
    public String getVendorState() {
        return vendorState;
    }
    @Column(name="vendor_state")
    public void setVendorState(String vendorState) {
        this.vendorState = vendorState;
    }
    @Column(name="vendor_zip_code")
    public String getVendorZipCode() {
        return vendorZipCode;
    }
    @Column(name="vendor_zip_code")
    public void setVendorZipCode(String vendorZipCode) {
        this.vendorZipCode = vendorZipCode;
    }
    @Column(name="vendor_phone")
    public String getVendorPhone() {
        return vendorPhone;
    }
    @Column(name="vendor_phone")
    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }
    @Column(name="vendor_contact_last_name")
    public String getVendorContactLastName() {
        return VendorContactLastName;
    }
    @Column(name="vendor_contact_last_name")
    public void setVendorContactLastName(String vendorContactLastName) {
        VendorContactLastName = vendorContactLastName;
    }
    @Column(name="vendor_contact_first_name")
    public String getVendorContactFirstName() {
        return VendorContactFirstName;
    }
    @Column(name="vendor_contact_first_name")
    public void setVendorContactFirstName(String vendorContactFirstName) {
        VendorContactFirstName = vendorContactFirstName;
    }
    @Transient
    @Column(name="default_terms_id")
    public int getDefaultTermsId() {
        return defaultTermsId;
    }
    @Transient
    @Column(name="default_terms_id")
    public void setDefaultTermsId(int defaultTermsId) {
        this.defaultTermsId = defaultTermsId;
    }
    @Transient
    @Column(name="default_account_number")
    public int getAccountNumber() {
        return accountNumber;
    }
    @Transient
    @Column(name="default_account_number")
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vendorId=" + id +
                ", vendorName='" + vendorName + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", vendorCity='" + vendorCity + '\'' +
                ", vendorState='" + vendorState + '\'' +
                ", vendorZipCode='" + vendorZipCode + '\'' +
                ", vendorPhone='" + vendorPhone + '\'' +
                ", VendorContactLastName='" + VendorContactLastName + '\'' +
                ", VendorContactFirstName='" + VendorContactFirstName + '\'' +
                ", defaultTermsId=" + defaultTermsId +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
