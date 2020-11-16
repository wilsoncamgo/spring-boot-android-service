package com.example;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @NotEmpty
  private String first_name;
  @NotEmpty
  private String last_name;
  @NotEmpty
  private long identification;
  @NotEmpty
  private long cellphone;
  @NotEmpty
  private long way_payment;
  @NotEmpty
  private String address_person;
  @NotEmpty
  private String username;
  @NotEmpty
  private String password;

  public long getId() {
    return id;
  }


  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public long getIdentification() {
    return identification;
  }

  public void setIdentification(long identification) {
    this.identification = identification;
  }

  public long getCellphone() {
    return cellphone;
  }

  public void setCellphone(long cellphone) {
    this.cellphone = cellphone;
  }

  public long getWay_payment() {
    return way_payment;
  }

  public void setWay_payment(long way_payment) {
    this.way_payment = way_payment;
  }

  public String getAddress_person() {
    return address_person;
  }

  public void setAddress_person(String address_person) {
    this.address_person = address_person;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


}