package com.company;

/**
 * Created by uitschool JV on 1/17/2016.
 */
public class Girl {
    private int age;
    private int weight;
    private boolean pretty;
    private boolean acception;

    Girl() {
        age = 23;
        weight = 56;
        pretty = true;
        acception = true;
    }

    Girl(int age, int weight, boolean pretty)
    {
        if(age > 16)this.age = age;
        else System.out.println("Input correct age!");
        if(weight > 45)this.weight = weight;
        else System.out.println("Input correct weight!");
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
        if(age == 0 || age < 0) System.out.println("Age: ERROR");
        else System.out.println("Age: " + age);
        if(weight < 45) System.out.println("Weight: ERROR");
        else System.out.println("Weight: " + weight);
        System.out.println("Pretty: " + pretty);
    }

}
