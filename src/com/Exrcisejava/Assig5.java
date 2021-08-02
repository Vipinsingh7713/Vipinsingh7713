package com.Exrcisejava;

import java.util.Scanner;

public class Assig5 {
    void suitable_age(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age to check your eligibilty: ");
        int age = scan.nextInt();
        if(age<16){
            System.out.println("You can't drive");
        }
        else if(age>16 && age<17){


            System.out.println("you can drive but can't vote");
        }
        else if(age>18 && age<24){
            System.out.println("you can vote but not rent a car");
        }
        else if (age>25)
            System.out.println("You can do prety much anything");


    }

}
