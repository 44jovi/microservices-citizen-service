package com.microservia.citizen.rest.resource;

import com.microservia.citizen.rest.model.Citizen;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.Instant;

@Path("/register")
public class CitizenResource {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getCitizen() {
    return "Hello - I am a WIP.";
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
  public Response registerCitizen(
      @FormParam("givenName") String givenName,
      @FormParam("familyName") String familyName,
      @FormParam("dob") String dob) {

    Citizen citizen = new Citizen();

    citizen.setGivenName(givenName);
    citizen.setFamilyName(familyName);
    citizen.setDob(Instant.parse(dob));
    citizen.setNINumber("NI number generation WIP");

    return Response.status(201).entity(citizen).build();
  }
}
