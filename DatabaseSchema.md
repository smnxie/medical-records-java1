# Database Schema

## User
```sql
CREATE TABLE User (
        id INT PRIMARY KEY AUTO_INCREMENT,
        username VARCHAR(255) NOT NULL,
        role VARCHAR(100) NOT NULL
    );
```

## Admin
```sql
CREATE TABLE Admin (
        id INT PRIMARY KEY AUTO_INCREMENT,
        user_id INT NOT NULL,
        access_level VARCHAR(100),
        FOREIGN KEY (user_id) REFERENCES User(id) ON DELETE CASCADE
    );
```

## Doctor
```sql
CREATE TABLE Doctor (
        id INT PRIMARY KEY AUTO_INCREMENT,
        user_id INT NOT NULL,
        specialty VARCHAR(255) NOT NULL,
        FOREIGN KEY (user_id) REFERENCES User(id) ON DELETE CASCADE
    );
```

## Patient
```sql
CREATE TABLE Patient (
        id INT PRIMARY KEY AUTO_INCREMENT,
        user_id INT NOT NULL,
        date_of_birth DATE,
        medical_record_number VARCHAR(255) UNIQUE NOT NULL,
        FOREIGN KEY (user_id) REFERENCES User(id) ON DELETE CASCADE
    );
```

## Appointment
```sql
CREATE TABLE Appointment (
        id INT PRIMARY KEY AUTO_INCREMENT,
        doctor_id INT NOT NULL,
        patient_id INT NOT NULL,
        appointment_date DATETIME NOT NULL,
        status VARCHAR(50) NOT NULL,
        FOREIGN KEY (doctor_id) REFERENCES Doctor(id) ON DELETE CASCADE,
        FOREIGN KEY (patient_id) REFERENCES Patient(id) ON DELETE CASCADE
    );
```

## MedicalHistory
```sql
CREATE TABLE MedicalHistory (
        id INT PRIMARY KEY AUTO_INCREMENT,
        patient_id INT NOT NULL,
        diagnosis TEXT NOT NULL,
        treatment TEXT NOT NULL,
        visit_date DATE NOT NULL,
        FOREIGN KEY (patient_id) REFERENCES Patient(id) ON DELETE CASCADE
    );
```

## Prescription
```sql
CREATE TABLE Prescription (
        id INT PRIMARY KEY AUTO_INCREMENT,
        appointment_id INT NOT NULL,
        medication_name VARCHAR(255) NOT NULL,
        dosage VARCHAR(255) NOT NULL,
        instructions TEXT NOT NULL,
        FOREIGN KEY (appointment_id) REFERENCES Appointment(id) ON DELETE CASCADE
    );
```
##Billing
CREATE TABLE billing (
    id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT NOT NULL,
    appointment_id INT NOT NULL,
    amount DECIMAL(10,2) NOT NULL,
    payment_status ENUM('pending', 'paid', 'canceled') DEFAULT 'pending',
    payment_date TIMESTAMP NULL,
    FOREIGN KEY (patient_id) REFERENCES patient(id),
    FOREIGN KEY (appointment_id) REFERENCES appointment(id)
);

##Labtests
CREATE TABLE lab_tests (
    id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT NOT NULL,
    doctor_id INT NOT NULL,
    test_name VARCHAR(255) NOT NULL,
    test_result TEXT,
    test_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (patient_id) REFERENCES patient(id),
    FOREIGN KEY (doctor_id) REFERENCES doctor(id)
);

##insurance
CREATE TABLE insurance (
    id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT NOT NULL,
    provider_name VARCHAR(255) NOT NULL,
    policy_number VARCHAR(50) NOT NULL UNIQUE,
    coverage_details TEXT,
    expiry_date DATE NOT NULL,
    FOREIGN KEY (patient_id) REFERENCES patient(id)
);

##messages
CREATE TABLE messages (
    id INT AUTO_INCREMENT PRIMARY KEY,
    sender_id INT NOT NULL,
    receiver_id INT NOT NULL,
    message TEXT NOT NULL,
    sent_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (sender_id) REFERENCES users(id),
    FOREIGN KEY (receiver_id) REFERENCES users(id)
);

