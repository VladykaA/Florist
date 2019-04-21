package com.vladyka.printer;

import com.vladyka.abstractFlower.Flower;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Printer {
    public static void printBunchOfFlowers(ArrayList<Flower> flowerList){
        for (Flower f : flowerList){
            System.out.print(f.getName() + " , ");
        }
        System.out.println();
    }

    public static void printThePrice(BigDecimal price){
        System.out.println("The buch of flowers costs: " + price);
    }

    public static void printTheFlower(Flower f){
        if (f != null) {
            System.out.println("The Flower what you are looking fore is " + f.getName());
        }else{
            System.out.println("There is no such flower");
        }
    }
}
