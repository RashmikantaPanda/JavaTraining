package org.oupp.casestudy.hospitalmanagement;

public class TestHospitalManagement {
    public static void main(String[] args) {

        HospitalManagementSystem hms=new HospitalManagementSystem();


        /*Creating doctors*/
        Doctor doctor1=new Doctor(1,"Dr. Baikuntha Nath Panda","Medicine");
        Doctor doctor2=new Doctor(2,"Dr. Nihar Ranjan Nayak","ENT");
        Doctor doctor3=new Doctor(3,"Dr. Sk. Akhtar Parwin","Medicine");
        Doctor doctor4=new Doctor(4,"Dr. Prananath Acharya","Medicine");
        /*Adding doctors*/
        hms.addDoctor(doctor1);
        hms.addDoctor(doctor2);
        hms.addDoctor(doctor3);
        hms.addDoctor(doctor4);

        /*Creating Patient*/
        Patient patient1=new Patient(1,"RK Panda","15/06/2000",null);
        Patient patient2=new Patient(2,"Tarini Panda","25/08/2001",null);
//        Appointment appointment1=new Appointment(1,1,doctor1.getDoctorId(),"20/11/2023","12.00.00 am");
        Appointment appointment1=new Appointment(1,1,doctor1.getDoctorId(),"20/11/2023","12.00.00 pm");
        Appointment appointment2=new Appointment(2,2,doctor2.getDoctorId(),"25/11/2023","04.30.00 pm");
        patient1.setPatientAppointment(appointment1);
        patient2.setPatientAppointment(appointment2);

        hms.scheduleAppointment(appointment1);
        hms.scheduleAppointment(appointment2);

        /*Vital Signs*/
        VitalSign vitalSing1=new VitalSign("Cold",98.5);
        VitalSign vitalSing2=new VitalSign("Fever",102.5);

        hms.recordVitalSigns(patient1,vitalSing1);
        hms.recordVitalSigns(patient2,vitalSing2);

        patient1.getVitalSigns().add(vitalSing1);
        patient2.getVitalSigns().add(vitalSing2);
        hms.addPatient(patient1);
        hms.addPatient(patient2);

        /*Adding medication */
        Medication medication1=new Medication(1,"Paracitamol",2);
        Medication medication2=new Medication(2,"Azithromicyn",3);
        hms.addMedication(medication1);
        hms.addMedication(medication2);


        hms.administerMedication(patient1,medication1);
        hms.administerMedication(patient2,medication2);
        hms.administerMedication(patient2,medication1);


        System.out.println(hms);
        System.out.println(patient1);
        System.out.println(hms.getDoctors());
//        hms.generateRecords();

        hms.displayDoctors();
        hms.displayPatient();
        hms.displayAppointments();

    }
}
