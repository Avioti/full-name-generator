package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String First_name = scanner.nextLine();
        System.out.print("Middle name: ");
        String Middle_name = scanner.nextLine();
        System.out.print("Last name: ");
        String Last_name = scanner.nextLine();
        System.out.print("Suffix: ");
        String Suffix = scanner.nextLine();




        if (!Middle_name.isEmpty()){
            System.out.print(First_name.trim() + " " +  Middle_name.trim() + " " + Last_name.trim());
        }else{
            System.out.print(First_name.trim() + " " + Last_name.trim());
        }
        if (!Suffix.isEmpty()){
            System.out.print("," + " " + Suffix);
        }

    }
}
