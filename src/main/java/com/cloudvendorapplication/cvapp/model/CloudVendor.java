package com.cloudvendorapplication.cvapp.model;

public class CloudVendor {
   private String vendorId;
   private String vendorName;
   private String vendorAddress;
   private String vendorEmail;
public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorEmail) {
    this.vendorId = vendorId;
    this.vendorName = vendorName;
    this.vendorAddress = vendorAddress;
    this.vendorEmail = vendorEmail;
}
public CloudVendor() {
}
public String getVendorId() {
    return vendorId;
}
public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
}
public String getVendorName() {
    return vendorName;
}
public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
}
public String getVendorAddress() {
    return vendorAddress;
}
public void setVendorAddress(String vendorAddress) {
    this.vendorAddress = vendorAddress;
}
public String getVendorEmail() {
    return vendorEmail;
}
public void setVendorEmail(String vendorEmail) {
    this.vendorEmail = vendorEmail;
}
}
