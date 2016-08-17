package com.exist.ecc.person.core.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "PERSON")
public class Person {

  @Id
  @GeneratedValue
  @Column(name = "PERSON_ID")
  private long personId;

  @Embedded
  private Name name;

  @Embedded
  private Address address;

  @Temporal(value = TemporalType.DATE)
  @Column(name = "BIRTH_DATE")
  private Date birthDate;

  @Temporal(value = TemporalType.DATE)
  @Column(name = "DATE_HIRED")
  private Date dateHired;

  @Min(1)
  @Max(5)
  @Column(name = "GWA")
  private BigDecimal gwa;

  @Column(name = "EMPLOYED")
  private boolean employed;
  
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
  private Collection<Contact> contacts;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "PERSON_ROLE",
             joinColumns = @JoinColumn(name = "PERSON_ID"), 
             inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
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