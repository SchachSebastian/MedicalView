package com.medicalview.backend.data.Apotheke;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"crs", "type"})
public class ApothekenList {
    private int totalFeatures;
    @JsonProperty("features")
    private List<Apotheke> apotheken;
}
