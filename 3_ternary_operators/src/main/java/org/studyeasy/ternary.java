package org.studyeasy;

public class ternary {
    public static void main(String[] args) {
        int a=45;
        int b=60;
        int max=0;

        // ternary operators
        max= a>b ? a:b;
        System.out.println("the maximum value is :" +max);

        int a1=34;
        int b1=31;
        int c1=45;
        int maxi=0;
        maxi= a1>b1 ? a1>c1 ? a1:c1: b1>c1 ? b1:c1;
        System.out.println(" the maximum number is :" + maxi);
    }
}
