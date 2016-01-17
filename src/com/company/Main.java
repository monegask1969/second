package com.company;


public class Main {

    public static void main(String[] args) {
       /* Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(12.25);

        System.out.println(mybox1);
        System.out.println(mybox2);
        System.out.println(mybox3);*/

       /* Test ob = new Test(15,20);

        int x=10; int y=10;
        ob.meth(x,y);
        System.out.println("x and y before calll: " + x + " " + y);
        System.out.println("o.a and o.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);            //передача ссылки
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);*/

        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;
        ob.setc(100);
        System.out.println("a,b and c: " + ob.a + " " + ob.b + " " + ob.getc());


        Girl Katya = new Girl(17,88,false);
        Girl Masha = new Girl();
        Girl Alina = new Girl(20,52,true);

        String cinema = "Horror";         // 0 - ужасы
        String restaurant = "McDonalds";     // 0 - мак

        System.out.println("Info about Katya:");
        Katya.Info();
        System.out.println(Katya.cinema(cinema));
        System.out.println(Katya.restaurant(restaurant));
        System.out.println();
        System.out.println("Info about Masha:");
        Masha.Info();
        System.out.println(Masha.cinema(cinema));
        System.out.println(Masha.restaurant(restaurant));
        System.out.println();
        System.out.println("Info about Alina:");
        Alina.Info();
        System.out.println(Alina.cinema(cinema));
        System.out.println(Alina.restaurant(restaurant));


    }

}

