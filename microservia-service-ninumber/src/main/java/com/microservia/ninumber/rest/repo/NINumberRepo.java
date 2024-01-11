package com.microservia.ninumber.rest.repo;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped // To support ACID DB transactions
public class NINumberRepo {

  // TODO: Review using UUID as an alternative
  private final AtomicInteger nINumber = new AtomicInteger();

  public NINumberRepo() {
  }

  public String getNINumber() {
    return String.format("%010d", nINumber.incrementAndGet());
  }

}
