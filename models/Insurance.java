
package com.medical.records.models;

import java.util.Date;

public class Insurance {
    private int id;
    private int patientId;
    private String providerName;
    private String policyNumber;
    private String coverageDetails;
    private Date expiryDate;

    public Insurance(int id, int patientId, String providerName, String policyNumber, String coverageDetails, Date expiryDate) {
        this.id = id;
        this.patientId = patientId;
        this.providerName = providerName;
        this.policyNumber = policyNumber;
        this.coverageDetails = coverageDetails;
        this.expiryDate = expiryDate;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }

    public String getProviderName() { return providerName; }
    public void setProviderName(String providerName) { this.providerName = providerName; }

    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }

    public String getCoverageDetails() { return coverageDetails; }
    public void setCoverageDetails(String coverageDetails) { this.coverageDetails = coverageDetails; }

    public Date getExpiryDate() { return expiryDate; }
    public void setExpiryDate(Date expiryDate) { this.expiryDate = expiryDate; }
}
