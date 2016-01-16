package com.company;

/**
 * Created by uitschool JV on 1/16/2016.
 */
public class Box {
    double width;
    double height;
    double depth;

    Box()               // ŒÕ—“–” “Œ–
    {
        System.out.println("Constructiong Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume(){
        return  width * height * depth;
    }

}
