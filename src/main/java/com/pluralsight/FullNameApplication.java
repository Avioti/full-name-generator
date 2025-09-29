package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {


Namecheck();




    }
public static void Namecheck(){
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
    if (!Stringtruth(Middle_name)){
        System.out.print(First_name.trim() + " " +  Middle_name.trim() + " " + Last_name.trim());
    }else{
        System.out.print(First_name.trim().concat(" ") + Middle_name.trim() + Last_name.trim());
    }
    if (!Stringtruth(Suffix)){
        System.out.print(",".concat(" ") + Suffix.trim());
    }
}
    public static boolean Stringtruth(String str){
        if (str.trim().isEmpty())
            return true;
             else
            return false;

    }


}
