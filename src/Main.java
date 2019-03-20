import abstractFlower.Flower;
import flowers.Camomile;
import flowers.Rose;
import flowers.Tulip;
import interfaceFlower.Bunch;
import printer.Printer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bunch bunch = new Bunch(new ArrayList<Flower>());
        Flower rose = new Rose();
        Flower tulip = new Tulip();
        Flower camomile = new Camomile();


        bunch.addFlower(rose);
        bunch.addFlower(tulip);
        bunch.addFlower(camomile);
        bunch.getTheScape(3,7);

        Printer.printBunchOfFlowers(bunch.getFlowerList());
        Printer.printThePrice(bunch.getThePrice());
        Printer.printTheFlower(bunch.getTheScape(1,2));
    }
}
