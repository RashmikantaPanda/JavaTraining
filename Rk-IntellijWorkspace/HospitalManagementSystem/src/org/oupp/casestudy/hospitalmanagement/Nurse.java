package org.oupp.casestudy.hospitalmanagement;

public class Nurse {
    int nurseId;
    String nurseName;
    String speciality;

    public Nurse() {
    }

    public Nurse(int nurseId, String nurseName, String speciality) {
        this.nurseId = nurseId;
        this.nurseName = nurseName;
        this.speciality = speciality;
    }

    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "nurseId=" + nurseId +
                ", nurseName='" + nurseName + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
