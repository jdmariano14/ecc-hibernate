package com.exist.ecc.person.core.model;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("LANDLINE")
public class Landline extends Contact {
  
}