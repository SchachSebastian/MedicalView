package com.medicalview.backend;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.medicalview.backend.data.ApothekenDB;
import com.medicalview.backend.data.ApothekenList;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.io.IOException;

@Path("/")
public class ApothekenRessource {
    @GET
    @Path("/apotheken")
    @Produces("application/json")
    public ApothekenList getApotheken() {
        try {
            return ApothekenDB.getInstance().convertJSONToObject();
        } catch (UnirestException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}