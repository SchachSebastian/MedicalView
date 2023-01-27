package com.medicalview.backend.data.Arzt;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Geometry {
    private String type;
    private List<Double> coordinates;
}
