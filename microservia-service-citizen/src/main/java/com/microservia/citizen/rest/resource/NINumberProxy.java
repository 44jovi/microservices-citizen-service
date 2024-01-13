package com.microservia.citizen.rest.resource;

import com.microservia.citizen.rest.model.NINumber;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.io.Closeable;
import java.io.IOException;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "ninumber.proxy")
@Path("/api/NINumber")
public interface NINumberProxy extends Closeable {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  NINumber getNINumber();

  @Override
  void close() throws IOException;

}
