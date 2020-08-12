package org.knowm.xchange.stablehouse;


import org.knowm.xchange.stablehouse.dto.StablehouseAddress;
import org.knowm.xchange.stablehouse.dto.StablehouseRate;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public interface Stablehouse {

    @POST
    @Path("v1/deposits/get-address")
    StablehouseAddress getAddress(
            @QueryParam("currencyCode") String currencyCode, @HeaderParam("SH-API-KEY") String apikey,
            @HeaderParam("SH-SIGNATURE") String signature,
            @HeaderParam("SH-TIMESTAMP") String timestamp)
            throws IOException;

    @POST
    @Path("v1/funds/get-matrix")
    StablehouseRate getRate(
            @HeaderParam("SH-API-KEY") String apikey,
            @HeaderParam("SH-SIGNATURE") String signature,
            @HeaderParam("SH-TIMESTAMP") String timestamp)
            throws IOException;

}
