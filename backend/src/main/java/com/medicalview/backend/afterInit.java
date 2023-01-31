package com.medicalview.backend;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.medicalview.backend.data.Apotheke.ApothekenDB;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.IOException;

@Singleton
@Startup
public class afterInit {

    // TODO make init on startup working
    @PostConstruct
    public void onStartup() {
        try {
            ApothekenDB.getInstance().init();
        } catch (UnirestException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}