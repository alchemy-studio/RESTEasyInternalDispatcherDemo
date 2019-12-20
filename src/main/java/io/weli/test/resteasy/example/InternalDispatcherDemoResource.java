package io.weli.test.resteasy.example;

import org.jboss.resteasy.core.InternalDispatcher;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/")
public class InternalDispatcherDemoResource {

    @GET
    @Path("/internal")
    public String foo() {
        return "foo";
    }


    @GET
    @Path("/forward")
    @Produces(MediaType.TEXT_PLAIN)
    public String get(@Context InternalDispatcher dispatcher) {
        return "forwarded: " + dispatcher.getEntity("/internal");
    }
}
