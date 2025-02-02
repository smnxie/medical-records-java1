
package com.medical.records.models;

import java.util.Date;

public class LabTests {
    private int id;
    private int patientId;
    private int doctorId;
    private String testName;
    private String testResult;
    private Date testDate;

    public LabTests(int id, int patientId, int doctorId, String testName, String testResult, Date testDate) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.testName = testName;
        this.testResult = testResult;
        this.testDate = testDate;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }

    public int getDoctorId() { return doctorId; }
    public void setDoctorId(int doctorId) { this.doctorId = doctorId; }

    public String getTestName() { return testName; }
    public void setTestName(String testName) { this.testName = testName; }

    public String getTestResult() { return testResult; }
    public void setTestResult(String testResult) { this.testResult = testResult; }

    public Date getTestDate() { return testDate; }
    public void setTestDate(Date testDate) { this.testDate = testDate; }
}
