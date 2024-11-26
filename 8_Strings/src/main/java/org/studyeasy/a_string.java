package org.studyeasy;

import java.util.Scanner;

public class a_string {
    public static void main(a_string[] args) {
       String name ="Shivansh";
       // we can initialise string int two ways
        //by using string datatype
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first name?" );
        String name1= sc.nextLine();

       // Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first name?" );
        String name2= sc.nextLine();

        System.out.println("Your full name is : "+ name1 + name2);




    }
}
