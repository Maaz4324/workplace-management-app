package com.company.communication;

import java.util.List;

public class CommunicationSystem {
    public void sendMessage(String from, String to, String message) {
        System.out.println("Message from " + from + " to " + to + ": " + message);
    }

    public void sendEmail(String from, String to, String subject, String body) {
        System.out.println("Email from " + from + " to " + to + "\nSubject: " + subject + "\nBody: " + body);
    }

    public void scheduleMeeting(String organizer, List<String> participants, String dateTime) {
        System.out.println("Meeting scheduled by " + organizer + " with participants " + participants + " on " + dateTime);
    }
}
