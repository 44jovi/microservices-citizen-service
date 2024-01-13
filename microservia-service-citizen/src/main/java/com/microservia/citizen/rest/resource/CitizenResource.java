package com.microservia.citizen.rest.resource;

import com.microservia.citizen.rest.model.Citizen;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.io.IOException;
import java.time.Instant;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/register")
public class CitizenResource {

  @Inject
  @RestClient
  NINumberProxy nINumberProxy;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getCitizen() {
    return "Microservia - Citizen Service";
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
  public Response registerCitizen(
      @FormParam("givenName") String givenName,
      @FormParam("familyName") String familyName,
      @FormParam("dob") String dob) throws IOException {

    Citizen citizen = new Citizen();

    citizen.setGivenName(givenName);
    citizen.setFamilyName(familyName);
    citizen.setDob(Instant.parse(dob));

    try {
      citizen.setNINumber(nINumberProxy.getNINumber().nINumber);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    } finally {
      nINumberProxy.close();
    }

    return Response.status(201).entity(citizen).build();
  }
}
