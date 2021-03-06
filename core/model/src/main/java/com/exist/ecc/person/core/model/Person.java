package com.exist.ecc.person.core.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Collection;

public class Person {

  private long personId;

  private Name name;

  private Address address;

  private Date birthDate;

  private Date dateHired;

  private BigDecimal gwa;

  private boolean employed;
  
  private Collection<Contact> contacts;

  private Collection<Role> roles;

  public long getPersonId() {
    return personId;
  }

  public void setPersonId(long newPersonId) {
    personId = newPersonId;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name newName) {
    name = newName;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address newAddress) {
    address = newAddress;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date newBirthDate) {
    birthDate = newBirthDate;
  }

  public Date getDateHired() {
    return dateHired;
  }

  public void setDateHired(Date newDateHired) {
    dateHired = newDateHired;
  }

  public BigDecimal getGwa() {
    return gwa;
  }

  public void setGwa(BigDecimal newGwa) {
    gwa = newGwa;
  }

  public boolean isEmployed() {
    return employed;
  }

  public void setEmployed(boolean newEmployed) {
    employed = newEmployed;
  }

  public Collection<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(Collection<Contact> newContacts) {
    contacts = newContacts;
  }

  public Collection<Role> getRoles() {
    return roles;
  }

  public void setRoles(Collection<Role> newRole) {
    roles = newRole;
  }
  
}