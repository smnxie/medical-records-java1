
package com.medical.records.models;

public class Prescription {
    private int id;
    private Patient patient;
    private Doctor doctor;
    private String medicine;
    private String dosage;

    public Prescription(int id, Patient patient, Doctor doctor, String medicine, String dosage) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.medicine = medicine;
        this.dosage = dosage;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "Prescription{id=" + id + ", patient=" + patient + ", doctor=" + doctor + ", medicine='" + medicine + "', dosage='" + dosage + "'}";
    }
}
