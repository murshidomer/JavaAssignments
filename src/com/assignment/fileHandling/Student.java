package com.assignment.fileHandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Student implements Serializable {
    private int rollNumber;
    private String firstName;
    private String lastName;
    private String course;
    private String phoneNumber;
    private String hostel;

    private Student() {
    }

    private Student(int rollNumber, String firstName, String lastName, String course, String phoneNumber,
                    String hostel) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.phoneNumber = phoneNumber;
        this.hostel = hostel;
    }


    public static void main(String[] args) {
        String path = "C:\\Users\\Murshid\\Desktop\\readTest.txt";
        Student student = new Student();
        System.out.println(student);
        student.readFromCSV(path);
    }

    private void readFromCSV(String path) {
        try {
            Reader reader = new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8);
            Writer writer = new OutputStreamWriter(new FileOutputStream(
                    "C:\\Users\\Murshid\\Desktop\\readTestOuttput.txt"), StandardCharsets.UTF_8);
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return
                "Roll Number: " + rollNumber + "\n" +
                        "Name: " + firstName + " " + lastName + "\n" +
                        "Course: " + course + "\n" +
                        "Phone Number: " + phoneNumber + "\n" +
                        "Name of the Hostel: " + hostel + "\n" +
                        "******************************************************";
    }

}
