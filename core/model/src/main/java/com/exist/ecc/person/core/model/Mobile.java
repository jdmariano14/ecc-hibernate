package com.exist.ecc.person.core.model;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("MOBILE")
public class Mobile extends Contact {
  
}