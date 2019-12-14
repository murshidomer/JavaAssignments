package com.company;

import java.util.Scanner;

public class MyList {
    public int[] moveTestArray;

    public MyList() {
        moveTestArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }


    public void manipulateArray() {
//        print original array
        System.out.println("Contents of original array: ");
        for (int i : moveTestArray) {
            System.out.print(i + " ");
        }

        System.out.println();

//        get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to be inserted: ");
        int numberValue = input.nextInt();
        System.out.println("Enter the position for the new number added to the array: ");
        int numberPosition = input.nextInt();

//        copy array to temporary array, insert the number, and copy from the temporary array
        int[] temp = new int[moveTestArray.length];
        System.arraycopy(moveTestArray, numberPosition, temp, numberPosition, (moveTestArray.length - numberPosition));
        moveTestArray[numberPosition] = numberValue;
        System.arraycopy(temp, numberPosition, moveTestArray, numberPosition + 1,
                ((moveTestArray.length - numberPosition) - 1));

//       print modified array
        System.out.println("Contents of modified array: ");
        for (int i : moveTestArray) {
            System.out.print(i + " ");

        }
    }

}
