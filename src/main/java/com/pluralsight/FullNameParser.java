package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParser {
    public static void main(String[] args) {

Nameparser();



    }
    public static void Nameparser(){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String Full_name = scanner.nextLine().trim();


        String[] Full_named = Full_name.split("\\ ");

        if (Full_named.length < 3 ){
            System.out.println("First name: " + Full_named[0].trim());
            System.out.println("Last_name: " + Full_named[1].trim());
        } else {
            System.out.println("First name: " + Full_named[0].trim());
            System.out.println("Middle name: " + Full_named[1].trim());
            System.out.println("Last name: " + Full_named[2].trim());
        }






    }
    public static boolean Stringtruth(String str){
        if (str.trim().isEmpty())
            return true;
        else
            return false;

    }


}
