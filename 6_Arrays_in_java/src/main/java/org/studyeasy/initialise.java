package org.studyeasy;

public class initialise {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        System.out.println(arr[1]);
        // by not directing initialisation

        int h1[]= new int[5];

        h1[0]=1;
        h1[1]=3;

        System.out.println(h1.length);
    }
}
