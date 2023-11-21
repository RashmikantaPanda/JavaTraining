package org.oupp.casestudy.hospitalmanagement;

public class Medication {
    int medicationId;
    String medicationName;
    int dosage;

    public Medication() {
    }

    public Medication(int medicationId, String medicationName, int dosage) {
        this.medicationId = medicationId;
        this.medicationName = medicationName;
        this.dosage = dosage;
    }

    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "medicationId=" + medicationId +
                ", medicationName='" + medicationName + '\'' +
                ", dosage=" + dosage +
                '}';
    }
}
