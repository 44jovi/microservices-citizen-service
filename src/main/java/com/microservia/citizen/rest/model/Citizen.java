package com.microservia.citizen.rest.model;

import java.time.Instant;

public class Citizen {

  private String givenName;
  private String familyName;
  private Instant dob;
  private String NINumber;

  @Override
  public String toString() {
    return "Citizen{" +
        "givenName='" + givenName + '\'' +
        ", familyName='" + familyName + '\'' +
        ", dob=" + dob +
        ", NINumber='" + NINumber + '\'' +
        '}';
  }

  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public Instant getDob() {
    return dob;
  }

  public void setDob(Instant dob) {
    this.dob = dob;
  }

  public String getNINumber() {
    return NINumber;
  }

  public void setNINumber(String NINumber) {
    this.NINumber = NINumber;
  }
}
