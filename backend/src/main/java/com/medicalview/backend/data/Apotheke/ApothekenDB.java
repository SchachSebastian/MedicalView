package com.medicalview.backend.data.Apotheke;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;

public class ApothekenDB {

    private static final ApothekenDB instance = new ApothekenDB();
    private ApothekenList apothekenList;

    private ApothekenDB(){

    }

    private String getJSONFromWebsite() throws UnirestException, IOException {
        Unirest.setTimeouts(0,0);
        HttpResponse<String> response = Unirest.get("http://data.wien.gv.at/daten/geo?service=WFS&request=GetFeature&version=1.1.0&typeName=ogdwien:APOTHEKEOGD&srsName=EPSG:4326&outputFormat=json")
                .asString();
        Unirest.shutdown();
        return response.getBody();
    }

    public ApothekenList convertJSONToObject() throws IOException, UnirestException {
        String json = getJSONFromWebsite();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper
                .readerFor(ApothekenList.class)
                .readValue(json);
    }

    public void init() throws UnirestException, IOException {
        apothekenList = convertJSONToObject();
    }

    public ApothekenList getApothekenList(){
        if(apothekenList == null){
            try {
                init();
            } catch (UnirestException | IOException e) {
                throw new RuntimeException(e);
            }
        }
        return apothekenList;
    }

    public static synchronized  ApothekenDB getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        try {
            System.out.println(ApothekenDB.getInstance().convertJSONToObject());
        } catch (UnirestException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
