package com.medicalview.backend.data.Arzt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;

public class ArztDB {

    private static final ArztDB instance = new ArztDB();
    private ArztList arztList;

    private ArztDB(){

    }

    private String getJSONFromWebsite() throws UnirestException, IOException {
        Unirest.setTimeouts(0,0);
        HttpResponse<String> response = Unirest.get("http://data.wien.gv.at/daten/geo?service=WFS&request=GetFeature&version=1.1.0&typeName=ogdwien:ARZTOGD&srsName=EPSG:4326&outputFormat=json")
                .asString();
        Unirest.shutdown();
        return response.getBody();
    }

    public ArztList convertJSONToObject() throws IOException, UnirestException {
        String json = getJSONFromWebsite();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper
                .readerFor(ArztList.class)
                .readValue(json);
    }

    public void init() throws UnirestException, IOException {
        arztList = convertJSONToObject();
    }

    public ArztList getArztList(){
        if(arztList == null){
            try {
                init();
            } catch (UnirestException | IOException e) {
                throw new RuntimeException(e);
            }
        }
        return arztList;
    }

    public static synchronized ArztDB getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        try {
            System.out.println(ArztDB.getInstance().convertJSONToObject());
        } catch (UnirestException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
