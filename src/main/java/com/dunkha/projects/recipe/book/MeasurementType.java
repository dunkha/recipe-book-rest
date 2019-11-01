package com.dunkha.projects.recipe.book;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MeasurementType {
    COUNT, TEASPOON, SPOON, MILLIGRAM, GRAM, KILOGRAM, MILLILITER, CENTILITER, DECILITER, LITER, CAN, PORTION;

    @JsonValue
    public String getValue() {
        return this.name();
    }

    @JsonCreator
    public static MeasurementType of(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }

        return valueOf(value);
    }
}
