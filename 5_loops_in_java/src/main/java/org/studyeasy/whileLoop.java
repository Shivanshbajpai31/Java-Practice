package org.studyeasy;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
       // int
        //int x=10;
       // while(x<20){
            //System.out.println("Value of x is :"+ x);
           // x++;

       // }
        Scanner sc=new Scanner(System.in);
        boolean hasLearnt=false;
        while(!hasLearnt){
            System.out.println("You go to school , you learn something");
            System.out.println("you learn something or not ??");
            hasLearnt= sc.nextBoolean();

        }

    }
}
