package interfaceFlower;

import abstractFlower.Flower;

import java.util.ArrayList;
import java.util.Collections;

public class Bunch implements IBunchOfFlowers {

    private ArrayList<Flower> flowerList;

    public Bunch(ArrayList<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    @Override
    public ArrayList<Flower> sortTheBunch(ArrayList<Flower> flowers) {
        Collections.sort(flowerList);
        return flowerList;
    }

    public ArrayList<Flower> getFlowerList() {
        return sortTheBunch(flowerList);
    }

    @Override
    public void addFlower(Flower flower) {
        flowerList.add(flower);
    }

    @Override
    public int getThePrice() {
        int res = 0;
        for (Flower f: this.flowerList){
            if (f != null){
                res += f.getPrice();
            }else{
                break;
            }
        }
        return res;
    }

    @Override
    public Flower getTheScape(int min, int max) {
        Flower flower = null;
        for (Flower f: this.flowerList) {
            if (f.getScape()> min && f.getScape()<max){
                flower = f;
            }
        }
        return flower;
    }


}
