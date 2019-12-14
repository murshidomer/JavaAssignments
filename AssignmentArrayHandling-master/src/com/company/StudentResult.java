package com.company;

import java.util.Scanner;

public class StudentResult {
    public String[] names;
    public int[] marks;

    public StudentResult() {
        names = new String[]{" Adelia Marroquin ", " Verlene Leiser ", " Abraham Weitz ", " Ina Mowbray ",
                " Maida Mcenaney ", " Terina Quinby ", " Laurena Rolon ", " Chery Channel ", " Lue Fyock ",
                " Neta Troester "};

        marks = new int[]{65, 82, 94, 90, 40, 21, 79, 99, 100, 98};
    }

    public void sortArray() {

        System.out.println("Raw array contents: ");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-20s", names[i]);
            System.out.println(+marks[i]);
        }

        System.out.println("\nEnter sorting paramter (names or marks): ");
        Scanner input = new Scanner(System.in);
        String sortParamter = input.nextLine();

        String tempName = "";
        int tempMark = 0;
        if (sortParamter.equals("names")) {
            for (int i = 0; i < names.length; i++) {
                for (int j = 0; j < names.length; j++) {
                    tempName = names[j];
                    tempMark = marks[j];
                    if (names[i].charAt(1) < names[j].charAt(1)) {
                        names[j] = names[i];
                        marks[j] = marks[i];
                        names[i] = tempName;
                        marks[i] = tempMark;
                    }
                }
            }
        }

        if (sortParamter.equals("marks")) {
            for (int i = 0; i < marks.length; i++) {
                for (int j = 0; j < marks.length; j++) {
                    tempMark = marks[j];
                    tempName = names[j];
                    if (marks[i] < marks[j]) {
                        marks[j] = marks[i];
                        names[j] = names[i];
                        marks[i] = tempMark;
                        names[i] = tempName;
                    }
                }
            }
        }

        System.out.println("Sorted array contents: ");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-20s", names[i]);
            System.out.println(+marks[i]);
        }
    }
}
