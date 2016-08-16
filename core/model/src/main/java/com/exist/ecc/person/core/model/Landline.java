package com.exist.ecc.person.core.model;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

import javax.validation.constraints.Pattern;

@Entity
@DiscriminatorValue("LANDLINE")
public class Landline extends Contact {

  @Pattern(regexp="\\A[0-9\\-+]+\\z")
  @Override
  public String getInfo() {
    return super.getInfo();
  }
  
}