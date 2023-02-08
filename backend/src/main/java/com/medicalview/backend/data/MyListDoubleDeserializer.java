package com.medicalview.backend.data;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.List;

public class MyListDoubleDeserializer extends StdDeserializer<List<Double>> {
    protected MyListDoubleDeserializer(Class<List<Double>> vc) {
        super(vc);
    }

    public MyListDoubleDeserializer(){
        this(null);
    }

    @Override
    public List<Double> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        List<Double> list = jsonParser.readValueAs(new TypeReference<List<Double>>() {});
        double a = list.get(0);
        double b = list.get(1);
        list.set(0, b);
        list.set(1, a);
        return list;
    }
}
