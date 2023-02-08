package com.medicalview.backend;

import com.medicalview.backend.data.Apotheke.ApothekenDB;
import com.medicalview.backend.data.Apotheke.ApothekenList;
import com.medicalview.backend.data.Arzt.ArztDB;
import com.medicalview.backend.data.Arzt.ArztList;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/")
public class MedicalViewRessource {
    @GET
    @Path("/apotheken")
    @Produces("application/json")
    public ApothekenList getApotheken() {   
        return ApothekenDB.getInstance().getApothekenList();
    }

    @GET
    @Path("/arzt")
    @Produces("application/json")
    public ArztList getArzt(){
        return ArztDB.getInstance().getArztList();
    }
}