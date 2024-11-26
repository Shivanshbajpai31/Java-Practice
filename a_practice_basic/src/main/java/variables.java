public class variables {
    public static void main(String[] args) {

        int a = 5;
        int b=10;

        float pi=3.14f;
        double d=3.90;
        byte marks=13;
        short h=23;
        char ch='A';

        System.out.println(pi);
        System.out.println(d);

        // implict type conversion- In this we convert the datatypes into different datatypes like int to long automatically in java
        int hello=1273;
        long newHello=hello; // Implicit type conversions
        System.out.println(newHello);


        //explicit type conversions
        long hello1=128;
        int  newhello1=(int) hello1;
        System.out.println(newhello1);


    }
}
