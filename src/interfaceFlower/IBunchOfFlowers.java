package interfaceFlower;

import abstractFlower.Flower;

import java.util.ArrayList;

public interface IBunchOfFlowers {

    void addFlower(Flower flower);

    int getThePrice();

    Flower getTheScape(int a, int b);

    ArrayList<Flower> sortTheBunch(ArrayList<Flower> flowers);
}
