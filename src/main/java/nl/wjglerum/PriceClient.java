package nl.wjglerum;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.quarkus.runtime.annotations.RegisterForReflection;
import nl.wjglerum.xml.Prices;

@RegisterRestClient
@RegisterForReflection(targets = XMLGregorianCalendar.class)
interface PriceClient {

    @GET
    @Path("/{filename}")
    Prices retrieve(@PathParam("filename") String filename);
}
