package com.company;

/**
 * Created by uitschool JV on 12/27/2015.
 */
public class ArrayInvert {
    public static void invert(int[]arr)
    {
        for(int k=0;k<arr.length/2;k++)
        {
            int tmp=arr[k];
            arr[k]=arr[arr.length-k-1];
            arr[arr.length-k-1]=tmp;
            System.out.println("arr[k]= "+arr[k]);
            System.out.println("tmp= "+tmp);
        }
    }
}
