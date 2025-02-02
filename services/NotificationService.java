
package com.medical.records.services;

public class NotificationService {

    public void sendNotification(String message, String recipient) {
        System.out.println("Sending notification to " + recipient + ": " + message);
    }
}
