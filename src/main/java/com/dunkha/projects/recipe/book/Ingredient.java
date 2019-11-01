package com.dunkha.projects.recipe.book;

public class Ingredient {
    private int orderNro;
    private String name;
    private MeasurementType measurementType;
    private double measurement;

    public int getOrderNro() {
        return orderNro;
    }

    public void setOrderNro(int orderNro) {
        this.orderNro = orderNro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MeasurementType getMeasurementType() {
        return measurementType;
    }


    public void setMeasurementType(MeasurementType measurementType) {
        this.measurementType = measurementType;
    }

    public double getMeasurement() {
        return measurement;
    }

    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }
}
