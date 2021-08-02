package com.Exrcisejava;

import java.util.Scanner;

public class Assgn3 {
    void countBMI(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height in meter: ");
        float height = scan.nextFloat();
        System.out.println("Entre Weight: ");
        float weight = scan.nextFloat();
        height = height*height;
        float BMI = weight/height;
        System.out.println("Your BMI is: "+BMI);

    }
}
