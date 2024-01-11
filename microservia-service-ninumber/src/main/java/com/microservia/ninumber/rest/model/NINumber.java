package com.microservia.ninumber.rest.model;

public class NINumber {

  private String nINumber;

  @Override
  public String toString() {
    return "NINumber{" +
        "nINumber='" + nINumber + '\'' +
        '}';
  }

  public String getNINumber() {
    return nINumber;
  }

  public void setNINumber(String nINumber) {
    this.nINumber = nINumber;
  }

}
