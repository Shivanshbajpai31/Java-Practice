package org.studyeasy;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float firstNumber=sc.nextFloat();
        float secondNumber=sc.nextFloat();

        double result= firstNumber+secondNumber;
        System.out.println(result);
        sc.close(); // we use this close method because it may cause the memory leakage

    }
}
