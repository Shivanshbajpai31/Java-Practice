package org.studyeasy;

import org.w3c.dom.ls.LSOutput;

public class doWhile {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println(i);
            System.out.println("hello");
            i++;
        }
        while (i <= 7);
        System.out.println("Out of the loop");
    }
}
