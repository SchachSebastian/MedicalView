package com.medicalview.backend.data.Arzt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"SE_ANNO_CAD_DATA"})
public class ArztProperties {
    @JsonProperty("OBJECTID")
    private int id;
    @JsonProperty("NAME")
    private String name;
    @JsonProperty("ADRESSE")
    private String adresse;
    @JsonProperty("FACH")
    private String fach;
    @JsonProperty("TELEFON")
    private String telefon;
    @JsonProperty("INTERNET")
    private String url;
}
