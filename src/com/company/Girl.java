package com.company;

/**
 * Created by uitschool JV on 1/17/2016.
 */
public class Girl {
    int age;
    int weight;
    boolean pretty;
    boolean acception;

    Girl() {
        age = 23;
        weight = 56;
        pretty = true;
        acception = true;
    }

    Girl(int age, int weight, boolean pretty) {
        this.age = age;
        this.weight = weight;
        this.pretty = pretty;
        acception = false;
    }

    String cinema(String cinema) {
        if (cinema.equals("Horror") && acception == false) {
            return "Say about " + cinema + ": We will not go!";
        } else
        {
            return "Say about " + cinema + ": Ok, I will go!";
        }
    }

    String restaurant(String restaurant) {
        if (restaurant.equals("McDonalds") && acception == false) {
            return "Say about " + restaurant + ": We will not go!";
        } else {
            return "Say about " + restaurant + ": Ok, I will go!";
        }
    }

    void Info()
    {
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Pretty: " + pretty);
    }

}
