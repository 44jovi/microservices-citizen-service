package com.microservia.ninumber.rest.resource;

import com.microservia.ninumber.rest.model.NINumber;
import com.microservia.ninumber.rest.repo.NINumberRepo;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/NINumber")
public class NINumberResource {

  @Inject
  private NINumberRepo NINumberRepo;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response getNewNINumber() {

    NINumber nINumber = new NINumber();

    nINumber.setNINumber(NINumberRepo.getNINumber());

    return Response.status(200).entity(nINumber).build();
  }

}
