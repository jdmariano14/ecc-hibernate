package com.exist.ecc.person.core.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import javax.validation.constraints.Pattern;

@Entity
@DiscriminatorValue("EMAIL")
public class Email extends Contact {

  @Pattern(regexp="\\A[\\w+\\-.]+@[a-z\\d\\-.]+\\.[a-z]+\\z")
  @Override
  public String getInfo() {
    return super.getInfo();
  }

}