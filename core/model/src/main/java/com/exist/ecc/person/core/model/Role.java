package com.exist.ecc.person.core.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "ROLE")
public class Role {

  @Id
  @GeneratedValue
  @Column(name = "ROLE_ID")
  private long roleId;
  
  @NotBlank
  @Column(name = "NAME")
  private String name;

  @ManyToMany(cascade = CascadeType.ALL, mappedBy = "roles")
  private Collection<Person> persons;

  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long newRoleId) {
    roleId = newRoleId;
  }

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public Collection<Person> getPersons() {
    return persons;
  }

  public void setPersons(Collection<Person> newPersons) {
    persons = newPersons;
  }
  
}