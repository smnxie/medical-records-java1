
package com.medical.records.models;

public class MedicalHistory {
    private int id;
    private Patient patient;
    private String historyDetails;

    public MedicalHistory(int id, Patient patient, String historyDetails) {
        this.id = id;
        this.patient = patient;
        this.historyDetails = historyDetails;
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

    public String getHistoryDetails() {
        return historyDetails;
    }

    public void setHistoryDetails(String historyDetails) {
        this.historyDetails = historyDetails;
    }

    @Override
    public String toString() {
        return "MedicalHistory{id=" + id + ", patient=" + patient + ", historyDetails='" + historyDetails + "'}";
    }
}
