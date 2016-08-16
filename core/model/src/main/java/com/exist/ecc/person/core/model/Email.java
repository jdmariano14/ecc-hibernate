package com.exist.ecc.person.core.model;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("EMAIL")
public class Email extends Contact {

}