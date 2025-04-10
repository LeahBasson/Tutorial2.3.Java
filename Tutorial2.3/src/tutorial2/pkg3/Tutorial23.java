package tutorial2.pkg3;

import java.util.Scanner;

public class Tutorial23 {

    public static void main(String[] args) {
        // Determines if a person is eligible to vote and drive based on their age.
        // Read in name and age.
        // if statement for if age, allows the person to and/or/not vote and drive.

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scn.next();

        System.out.println("Please enter your age: ");
        int age = scn.nextInt();

        if (age > 18 && age <= 21) {   
            System.out.print(name + " is eligible to vote but not to drive.");
        } else if (age > 21) {
            System.out.print(name + " is eligible to vote and drive.");
        } else {
            System.out.print(name + " is not eligible to vote or drive.");
        } 
        
        // if(age > 18){
        //      if(age > 21){
        //          
        //      }
        // }
    }

}
