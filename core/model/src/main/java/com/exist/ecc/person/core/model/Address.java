package com.exist.ecc.person.core.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

  @Column(name = "STREET_ADDRESS")
  private String streetAddress;

  @Column(name = "BARANGAY")
  private String barangay;

  @Column(name = "MUNICIPALITY")
  private String municipality;

  @Column(name = "ZIP_CODE")
  private String zipCode;

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String newStreetAddress) {
    streetAddress = newStreetAddress;
  }

  public String getBarangay() {
    return barangay;
  }

  public void setBarangay(String newBarangay) {
    barangay = newBarangay;
  }

  public String getMunicipality() {
    return municipality;
  }

  public void setMunicipality(String newMunicipality) {
    municipality = newMunicipality;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String newZipCode) {
    zipCode = newZipCode;
  }

}