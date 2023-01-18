package com.harsh.tech.mytestapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HarshHelloapp {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/sum")
    public int harshsum(){
        return 125 + 225;
    }
}