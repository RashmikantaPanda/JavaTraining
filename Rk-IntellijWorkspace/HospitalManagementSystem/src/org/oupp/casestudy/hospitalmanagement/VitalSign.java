package org.oupp.casestudy.hospitalmanagement;

public class VitalSign {
    String symptom;
    private double temperature;


    public VitalSign() {
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public VitalSign(String symptom, double temperature) {
        this.symptom = symptom;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "VitalSign{" +
                "symptom='" + symptom + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
