package com.medicalview.backend.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"SE_ANNO_CAD_DATA"})
public class ApothekenProperty {
    @JsonProperty("OBJECTID")
    private int id;
    @JsonProperty("BEZEICHNUNG")
    private String name;
    @JsonProperty("BEZIRK")
    private int bezirk;
    @JsonProperty("STRASSE")
    private String strasse;
    @JsonProperty("ONR")
    private String onr;
    @JsonProperty("ADRESSE")
    private String adresse;
    @JsonProperty("TELEFON")
    private String telefon;
    @JsonProperty("FAX")
    private String fax;
    @JsonProperty("EMAIL")
    private String email;
    @JsonProperty("WEBLINK1")
    private String url;

}
