package com.company;

import java.util.Arrays;

import static com.company.ArrayInvert.invert;


public class Main {

    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(a));
        invert(a);
        System.out.println(Arrays.toString(a));

    }

}

