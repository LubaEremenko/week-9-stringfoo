package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     //   DemoOne();
      //  DemoTwo();
        DemoTree();

    }

    public static void DemoTwo() {
        String s1 = "Hello there";
        char[] charArray = new char[5];
        System.out.printf("s1:%s", s1);

        System.out.printf("%nLength of s1: %d", s1.length());
        System.out.printf("%n The string without reversing is: ");

        for (int count = 0; count< s1.length(); count++) {
            System.out.printf("%c", s1.charAt(count));
        }
        System.out.printf("%n The string reversing is: ");
        for (int count = s1.length() - 1; count >= 0; count--) {
            System.out.printf("%c", s1.charAt(count));
        }
        s1.getChars(0, 5, charArray, 0);
        System.out.printf("%n The character array is: ");

        for (char character: charArray) {
            System.out.print(character);
        }
        System.out.println();

    }


    public static void DemoOne() {
        char[] charArray = {'b','i','r','t','h',' ', 'd','a','y'};
        String s1 = new String();
        String s2 = new String(s1);
        String s3 = new String(charArray);
        String s4 = new String(charArray,6,3);

        System.out.printf("s1 = %s%ns2 =%s%ns3 = %s%ns4 = %s%n", s1,s2,s3,s4);

    }

    public static void DemoTree() {
        //Scanner scanner = new Scanner(System.in);
       //System.out.println("Please enter your full name: ");
       // String fullName = scanner.nextLine();
        String S1 = "Liubov Eremenko";

        //length method of String returns the length of a String S1.
        int length = S1.length();
        System.out.println("Length of a full name is nn = " + length);

        //is the alphabetical position of the first initial of name

        class initials {

            public void extractInitials(String name)
            {
                if (name.length() == 0)
                    return;

                 System.out.print(Character.toUpperCase(
                        name.charAt(0)));


                for (int i = 1; i < name.length() - 1; i++)
                    if (name.charAt(i) == ' ')
                        System.out.print(" " + Character.toUpperCase(name.charAt(i + 1)));

                    name = "liubov eremenko";
                extractInitials(name);
            }
        }





    }
        }











