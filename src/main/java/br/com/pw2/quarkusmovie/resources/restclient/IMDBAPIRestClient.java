package br.com.pw2.quarkusmovie.resources.restclient;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "restcliente-imdb-api")
@Produces(MediaType.APPLICATION_JSON)
public interface IMDBAPIRestClient {

    MovieIMDB search(@HeaderParam("x-rapidapi-key") String xRapidapiKey,
                     @HeaderParam("x-rapidapi-host") String xRapidapiHost,
                     @QueryParam("q") String query);

}
