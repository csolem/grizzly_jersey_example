package com.github.grandmaflash.grizzly_jersey_example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("resource")
public class RestResource { 
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "yup";
    }
}
