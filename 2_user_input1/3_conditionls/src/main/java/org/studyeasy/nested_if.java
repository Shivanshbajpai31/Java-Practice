package org.studyeasy;

public class nested_if {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        int c=9;

        if (a>b){
            System.out.println(" a is greater than b");
            if(a>c){
                System.out.println("a is grater than c");
                System.out.println("a is largest" +a);
            }else {
                System.out.println("c is bigger than a");
                System.out.println("c is larger"+c);
            }
        }else{
            System.out.println("b is bigger than a");
            if (b>c){
                System.out.println(" b is bigger than c");
                System.out.println(" b is largest "+b);

            }else{
                System.out.println("c is bigger than b");
                System.out.println("c is largest "+c);
            }
        }
    }
}
