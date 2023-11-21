package org.oupp.casestudy.hospitalmanagement;

import java.util.ArrayList;

public class Patient {
    int patientId;
    String patientName;
    String dob;
    Appointment patientAppointment;
    ArrayList<Medication> patientMedication=new ArrayList<>();

    ArrayList<VitalSign> vitalSigns=new ArrayList<>();



    public Patient() {

    }

    public Patient(int patientId, String patientName, String dob, Appointment patientAppointment) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.dob = dob;

    }
    public Patient(int patientId, String patientName, String dob) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.dob = dob;

    }


    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Appointment getPatientAppointment() {
        return patientAppointment;
    }

    public void setPatientAppointment(Appointment patientAppointment) {
        this.patientAppointment = patientAppointment;
    }
    public ArrayList<Medication> getPatientMedication() {
        return patientMedication;
    }

    public void setPatientMedication(ArrayList<Medication> patientMedication) {
        this.patientMedication = patientMedication;
    }

    public ArrayList<VitalSign> getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(ArrayList<VitalSign> vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", dob='" + dob + '\'' +
                ", patientAppointment=" + patientAppointment +
                ", patientMedication=" + patientMedication +
                ", vitalSigns=" + vitalSigns +
                '}';
    }

    /*
    @Override
    public String toString() {
        return "-------------------------PATIENT DETAILS------------------------------\n"
                +"______________________________________________________________________"
                +String.format("|%-6s","ID")+""+String.format("|%-16s","NAME")+""+String.format("|%-11s","DOB")+""+String.format("|%-16s","Appointment DATE")+""+String.format("|%-16s|","Appointment TIME")
                +String.format("|%-5s",this.getPatientId()) + " " +String.format("|%-15s",this.getPatientName()) + " " + String.format("|%-10s",this.getDob()) + " " + String.format("|%-15s",this.getPatientAppointment().getAppointmentDate()) + " " + String.format("|%-16s|",this.getPatientAppointment().getAppointmentTime());

    }
*/


}
