package org.studyeasy;

import java.util.Scanner;

public class forloop {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number here:" );
        int n=sc.nextInt();

       // for(int i =0;i<=10;i++){
           // System.out.println( n + "*" +i +  "=" + i*n);
       // }
        int sum=0;
        for (int i=1 ;i<=n ; i++){
            sum=sum+i;
            // sum for even numbers natural numbers
            //sum= sum + 2*i -for even naturals numbers

        }
        System.out.println("SUm is :" +sum);

    }
}
