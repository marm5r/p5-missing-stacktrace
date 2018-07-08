package marm5r.p5.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/resource")
public class Resource {

    @GET
    public String op() {
        throw new RuntimeException();
    }

}
