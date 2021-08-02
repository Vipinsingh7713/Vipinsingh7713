package com.Exrcisejava;

import java.util.Scanner;

public class Assgn4 {
void transport(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the no. of Car(Should be not more the 50)");
    int cars = scan.nextInt();
    System.out.println("Enter no. of buses (Should not more than 15)");
    int bus = scan.nextInt();
    int people = 1000;
    System.out.println("Means of transports are Cars and buses");
    if (cars>=bus){
        System.out.println("Not efficient system");
    }
    else if(people>=750){
        System.out.println("Lets stay home");
    }
    else{
        System.out.println("lets take bus");
    }
}
}
