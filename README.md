# medical-records-java1
# Medical Records Management System (Updated)

## Overview

The **Medical Records Management System** is a Java-based application designed to simplify the management of patient records, doctor appointments, and prescription handling. This updated version includes additional database interaction features and optimized JDBC classes.

## Features

- **Patient Management:**
  - Add, list, and find patients.
  - Store and retrieve patient medical histories.

- **Appointment Management:**
  - Schedule, view, and update doctor appointments.

- **Prescription Management:**
  - Issue and manage patient prescriptions.

- **Billing System:**
  - Manage patient billing records and payment statuses.

- **Lab Test Management:**
  - Store and retrieve lab test results for patients.

- **Insurance Handling:**
  - Track patient insurance details and policy information.

- **Messaging System:**
  - Enable secure communication between doctors and patients.

- **Reporting:**
  - Generate detailed reports on medical records and appointment usage.

- **Database Integration:**
  - Persistent data storage using MySQL for patient and appointment records.

## Technologies Used

- **Programming Language:** Java
- **Database:** MySQL
- **Libraries:** JDBC for database connectivity

## Main Classes and Their Roles

### 1. **MedicalRecordsSystem**
The entry point of the application. It provides the main menu interface and handles user input for medical record operations.

### 2. **User (Abstract Class)**
A base class for all user types in the system.
- **Fields:** `userId`, `username`, `role`
- **Methods:** 
  - `getUserId()`
  - `getUsername()`
  - `getRole()`

### 3. **Admin (Subclass of User)**
Represents an admin with extended privileges.
- **Role:** Manage users, appointments, and prescriptions.

### 4. **Patient**
Represents a patient in the system.
- **Fields:** `id`, `name`, `contact`, `medicalHistory`
- **Methods:** 
  - `getId()`
  - `getName()`
  - `getContact()`
  - `getMedicalHistory()`

### 5. **Doctor**
Represents a doctor in the system.
- **Fields:** `id`, `name`, `specialty`
- **Methods:** 
  - `getId()`
  - `getName()`
  - `getSpecialty()`

### 6. **Appointment**
Handles appointment scheduling.
- **Fields:** `id`, `patient`, `doctor`, `dateTime`
- **Methods:** 
  - `getId()`
  - `getPatient()`
  - `getDoctor()`
  - `getDateTime()`

### 7. **Prescription**
Manages prescriptions issued to patients.
- **Fields:** `id`, `patient`, `doctor`, `medicine`, `dosage`
- **Methods:** 
  - `getId()`
  - `getPatient()`
  - `getDoctor()`
  - `getMedicine()`
  - `getDosage()`

### 8. **MedicalHistory**
Tracks the medical history of patients.
- **Fields:** `id`, `patient`, `historyDetails`

### 9. **Billing**
Manages patient billing and payments.
- **Fields:** `id`, `patientId`, `appointmentId`, `amount`, `paymentStatus`, `paymentDate`

### 10. **LabTests**
Handles storage of lab test records.
- **Fields:** `id`, `patientId`, `doctorId`, `testName`, `testResult`, `testDate`

### 11. **Insurance**
Stores patient insurance information.
- **Fields:** `id`, `patientId`, `providerName`, `policyNumber`, `coverageDetails`, `expiryDate`

### 12. **Messages**
Enables secure messaging between users.
- **Fields:** `id`, `senderId`, `receiverId`, `message`, `sentAt`

### 13. **DatabaseHandler**
Manages database connections and operations.
- **Methods:** 
  - `connect()`
  - `disconnect()`

### 14. **ScheduleManager**
Handles appointment schedules.

### 15. **NotificationService**
Sends reminders and notifications to patients.

### 16. **ReportGenerator**
Generates reports on patients, doctors, and appointments.


