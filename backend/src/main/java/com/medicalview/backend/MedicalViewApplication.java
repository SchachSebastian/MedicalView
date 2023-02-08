package com.medicalview.backend;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.medicalview.backend.data.Apotheke.ApothekenDB;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.io.IOException;

@ApplicationPath("/api")
public class MedicalViewApplication extends Application {
    public static void main(String[] args) {
    }
}