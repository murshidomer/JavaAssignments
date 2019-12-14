package com.assignment.fileHandling;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;

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
        student = student.readFromCSV(path);
        System.out.println(student);
    }

    private Student readFromCSV(String path) {
        FileInputStream input;
        DataInputStream dis;
        try {
            input = new FileInputStream(path);
            dis = new DataInputStream(input);
            int count = input.available();
/*
                dis.read(bytesArray);
                rollNumber = dis.read();
                char test = dis.readChar();
                firstName = new String(bytesArray) ;
                lastName = new String(bytesArray);
                course = new String(bytesArray);
                phoneNumber = new String(bytesArray);
                hostel = new String(bytesArray);
*/

            System.out.println(input.available());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readChar());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readLong());
            System.out.println(dis.readFloat());

           /* System.out.println("Int   : "+dis.readInt());
            System.out.println("Short : "+dis.readShort());
            System.out.println("Byte  : "+dis.readByte());*/
            dis.close();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Student(rollNumber, firstName, lastName, course, phoneNumber, hostel);
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
