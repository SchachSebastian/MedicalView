package com.medicalview.backend.data.Arzt;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medicalview.backend.data.MyListDoubleDeserializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Geometry {
    private String type;
    @JsonDeserialize(using = MyListDoubleDeserializer.class)
    private List<Double> coordinates;
}
