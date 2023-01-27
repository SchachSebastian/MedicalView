package com.medicalview.backend.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"crs"})
public class ApothekenList {
    private String type;
    private int totalFeatures;
    @JsonProperty("features")
    private List<Apotheke> apotheken;
}
