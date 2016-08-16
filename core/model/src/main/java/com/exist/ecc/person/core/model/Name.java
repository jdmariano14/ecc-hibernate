package com.exist.ecc.person.core.model;

import javax.persistence.Embeddable;
import javax.persistence.Column;

import org.hibernate.validator.constraints.NotBlank;

@Embeddable
public class Name {
  
  @NotBlank
  @Column(name = "LAST_NAME")
  private String lastName;

  @NotBlank
  @Column(name = "FIRST_NAME")
  private String firstName;

  @Column(name = "MIDDLE_NAME")
  private String middleName;

  @Column(name = "SUFFIX")
  private String suffix;

  @Column(name = "TITLE")
  private String title;
  
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String newLastName) {
    lastName = newLastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String newFirstName) {
    firstName = newFirstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String newMiddleName) {
    middleName = newMiddleName;
  }

  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String newSuffix) {
    suffix = newSuffix;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String newTitle) {
    title = newTitle;
  }

}