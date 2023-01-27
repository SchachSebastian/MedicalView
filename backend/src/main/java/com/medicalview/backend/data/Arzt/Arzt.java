package com.medicalview.backend.data.Arzt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"type"})
public class Arzt {
    private String id;
    private Geometry geometry;
    private String geometry_name;
    private ArztProperties properties;
}
