package org.studyeasy;

public class fo_loop {
    public static void main(String[] args) {
//         String names[]= {"Shivansh", "Chinu", "Sexy", "hello"};
//         for (int i=0 ; i<names.length ; i++){
//             System.out.println(names[i]);
//         }
//         // we can done this by for each loop
//        for(String name: names){
//            System.out.println(" Name is :" + name);
//        }
//        int numbers[]={2,3,5,6,7,8,9,9,1};
//        int sum=0;
//        for(Integer number: numbers){
//            sum+= number;
//
//        }
//        System.out.println(sum);
        // for finding the minimum valueeee
        int numbers[]={2,3,5,6,7,8,9,9,1};
        int min =Integer.MAX_VALUE;

        for(Integer number : numbers){
            if ( number < min){
                min= number;
            }
        }
        System.out.println(" minimum value is : "+ min);

    }
}
