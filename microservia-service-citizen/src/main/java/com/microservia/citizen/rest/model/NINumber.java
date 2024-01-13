package com.microservia.citizen.rest.model;

import com.microservia.citizen.rest.resource.NINumberProxy;

public class NINumber {

  /**
   * Represents a NI Number to be used as a function return type in the {@link NINumberProxy}
   * interface.
   */
  public String nINumber;

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
