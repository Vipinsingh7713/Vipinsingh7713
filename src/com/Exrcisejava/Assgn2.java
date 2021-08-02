package com.Exrcisejava;

import java.util.Scanner;

public class Assgn2 {
    void counter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. from where you want to count: ");
        int i = scan.nextInt();
        System.out.println("Till the no. you want to count: ");
        int j = scan.nextInt();
        System.out.println("Increment by: ");
        int k = scan.nextInt();
        for (i=i;i<=j;i=i+k){
            System.out.println("Your final Result: "+i);
        }

    }
}
