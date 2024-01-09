package com.microservia.citizen.rest.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/register")
public class CitizenResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get(){
        return "Hello - I am a WIP.";
    }
}
