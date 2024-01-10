package com.microservia.ninumber.rest.model;

public class NINumber {

  private String nin;

  @Override
  public String toString() {
    return "NINumber{" +
        "nin='" + nin + '\'' +
        '}';
  }

  public String getNin() {
    return nin;
  }

  public void setNin(String nin) {
    this.nin = nin;
  }
}
