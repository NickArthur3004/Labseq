package org.nicolas.Controllers;

import org.nicolas.Services.LabSeqService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/labseq")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LabseqController {

    @Inject
    LabSeqService service;

    @GET
    @Path("/{n}")
    public Response getLabseq(@PathParam("n") int n){
        if(n < 0){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Index must be non-negative")
                    .build();
        }
        
        long result = service.computeLabseq(n);
        return Response.ok(result).build();
    }
}
