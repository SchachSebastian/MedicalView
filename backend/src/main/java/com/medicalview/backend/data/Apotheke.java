package com.medicalview.backend.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apotheke {
    private String type;
    private String id;
    private Geometry geometry;
    private String geometry_name;
    private ApothekenProperty properties;
}
