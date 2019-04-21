package com.vladyka.interfaceFlower;

import com.vladyka.abstractFlower.Flower;

import java.math.BigDecimal;
import java.util.ArrayList;

public interface IBunchOfFlowers {

    void addFlower(Flower flower);

    BigDecimal getThePrice();

    Flower getTheScape(int a, int b);

    ArrayList<Flower> sortTheBunch(ArrayList<Flower> flowers);
}
