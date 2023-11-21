package org.oupp.casestudy.hospitalmanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HospitalManagementSystem {
    ArrayList<Patient> patients=new ArrayList<>();
    ArrayList<Doctor> doctors=new ArrayList<>();
    ArrayList<Nurse> nurses=new ArrayList<>();
    ArrayList<Appointment> appointments=new ArrayList<>();
    ArrayList<Medication> medications=new ArrayList<>();

    Map<Integer,VitalSign> vitalSignRecord=new HashMap<>();

    public HospitalManagementSystem() {
    }

    public HospitalManagementSystem(ArrayList<Patient> patients, ArrayList<Doctor> doctors, ArrayList<Nurse> nurses, ArrayList<Appointment> appointments, ArrayList<Medication> medications) {
        this.patients = patients;
        this.doctors = doctors;
        this.nurses = nurses;
        this.appointments = appointments;
        this.medications = medications;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public ArrayList<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(ArrayList<Nurse> nurses) {
        this.nurses = nurses;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public ArrayList<Medication> getMedications() {
        return medications;
    }

    public void setMedications(ArrayList<Medication> medications) {
        this.medications = medications;
    }

    @Override
    public String toString() {
        return "HospitalManagementSystem{" +
                "patients=" + patients +
                ", doctors=" + doctors +
                ", nurses=" + nurses +
                ", appointments=" + appointments +
                ", medications=" + medications +
                '}';
    }

    public void displayRecords(){

    }

    /*Methods*/

    /*To add a new patient*/
    public void addPatient(Patient patient){
//        new Patient();
        patients.add(patient);
    }

    /*To add a new doctor*/
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    /*Schedule Appointments*/
    public void scheduleAppointment(Appointment appointment){
        appointments.add(appointment);
    }

    public void addMedication(Medication medication){
        medications.add(medication);
    }
    public void administerMedication(Patient patient, Medication medication){
        patient.getPatientMedication().add(medication);
    }

    public void recordVitalSigns(Patient patient,VitalSign vitalSigns){
        vitalSignRecord.put(patient.getPatientId(),vitalSigns);

    }

    public void managePatientBilling(){}
    public void displayAppointments(){
        /*Patient Details*/
        System.out.println("-------------------------APPOINTMENT DETAILS--------------------------");
        System.out.println("______________________________________________________________________");
        System.out.println(String.format("|%-6s","ID")+""+String.format("|%-16s","NAME")+""+String.format("|%-11s","DOCTOR ID")+""+String.format("|%-16s","Appointment DATE")+""+String.format("|%-16s|","Appointment TIME"));
        System.out.println("-----------------------------------------------------------------------");
        for (Appointment appointment : appointments) {
            System.out.println(String.format("|%-5s",appointment.getAppointmentId()) + " " +String.format("|%-15s",appointment.getPatientId()) + " " + String.format("|%-10s",appointment.getDoctorId()) + " " + String.format("|%-15s",appointment.getAppointmentDate()) + " " + String.format("|%-16s|",appointment.getAppointmentTime()));
        }
        System.out.println("______________________________________________________________________");
    }
    public void displayPatient(){
        /*Patient Details*/
        System.out.println("-------------------------PATIENT DETAILS------------------------------");
        System.out.println("______________________________________________________________________");
        System.out.println(String.format("|%-6s","ID")+""+String.format("|%-16s","NAME")+""+String.format("|%-11s","DOB")+""+String.format("|%-16s","Appointment DATE")+""+String.format("|%-16s|","Appointment TIME"));
        System.out.println("-----------------------------------------------------------------------");
        for (Patient patient : patients) {
            System.out.println(String.format("|%-5s",patient.getPatientId()) + " " +String.format("|%-15s",patient.getPatientName()) + " " + String.format("|%-10s",patient.getDob()) + " " + String.format("|%-15s",patient.getPatientAppointment().getAppointmentDate()) + " " + String.format("|%-16s|",patient.getPatientAppointment().getAppointmentTime()));
        }
        System.out.println("______________________________________________________________________");

    }
    public void displayDoctors(){
        System.out.println("----------------DOCTOR DETAILS----------------");
        System.out.println("______________________________________________");
        System.out.println(String.format("|%-6s","ID")+""+String.format("|%-26s","NAME")+""+String.format("|%-10s|","SPECIALITY"));
        System.out.println("----------------------------------------------");
        for (Doctor doctor : doctors) {
            System.out.println(String.format("|%-5s",doctor.getDoctorId()) + " " +String.format("|%-25s",doctor.getDoctorName()) + " " + String.format("|%-10s|",doctor.getSpeciality()));
        }
        System.out.println("_______________________________________________");
    }
    public void generateRecords(){
        /*Patient Details*/
        System.out.println("-------------------------PATIENT DETAILS------------------------------");
        System.out.println("______________________________________________________________________");
        System.out.println(String.format("|%-6s","ID")+""+String.format("|%-16s","NAME")+""+String.format("|%-11s","DOB")+""+String.format("|%-16s","Appointment DATE")+""+String.format("|%-16s|","Appointment TIME"));
        System.out.println("-----------------------------------------------------------------------");
        for (Patient patient : patients) {
            System.out.println(String.format("|%-5s",patient.getPatientId()) + " " +String.format("|%-15s",patient.getPatientName()) + " " + String.format("|%-10s",patient.getDob()) + " " + String.format("|%-15s",patient.getPatientAppointment().getAppointmentDate()) + " " + String.format("|%-16s|",patient.getPatientAppointment().getAppointmentTime()));
        }
        System.out.println("______________________________________________________________________");



        /*Doctor Details*/
        System.out.println("\n\n");
        System.out.println("----------------DOCTOR DETAILS----------------");
        System.out.println("______________________________________________");
        System.out.println(String.format("|%-6s","ID")+""+String.format("|%-26s","NAME")+""+String.format("|%-10s|","SPECIALITY"));
        System.out.println("----------------------------------------------");
        for (Doctor doctor : doctors) {
            System.out.println(String.format("|%-5s",doctor.getDoctorId()) + " " +String.format("|%-25s",doctor.getDoctorName()) + " " + String.format("|%-10s|",doctor.getSpeciality()));
        }
        System.out.println("_______________________________________________");


        /*Medication Details*/
        System.out.println("\n\n");
        System.out.println("--------------MEDICATION DETAILS--------------");
        System.out.println("______________________________________________");
        System.out.println(String.format("|%-6s","ID")+""+String.format("|%-26s","NAME")+""+String.format("|%-10s|","DOSAGE"));
        System.out.println("----------------------------------------------");
        for (Medication medication : medications) {
            System.out.println(String.format("|%-5s",medication.getMedicationId()) + " " +String.format("|%-25s",medication.getMedicationName()) + " " + String.format("|%-10s|",medication.getDosage()));
        }
        System.out.println("_______________________________________________");

    }



}
