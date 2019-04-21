package com.vladyka.abstractFlower;

import java.math.BigDecimal;

public abstract class Flower implements Comparable {
    private final String name;
    private BigDecimal price;
    private int scape;
    private int freshness;

    public Flower(String name, BigDecimal price, int scape, int freshness) {
        if(name == null){
            throw new NullPointerException("Name cannot be null");
        }
        if(name.isEmpty()){
            throw new IllegalArgumentException("Name of the flower cannot be empty");
        }
        this.name = name;
        if(price == null){
            throw new NullPointerException("The price cannot be null");
        }
        if(price.compareTo(BigDecimal.ZERO)==-1){
            throw new IllegalArgumentException("The prise cannot be less a zero");
        }
        this.price = price;
        if (scape<=0){
            throw new IllegalArgumentException("The scape cannot be 0 or less");
        }
        this.scape = scape;
        this.freshness = freshness;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getScape() {
        return scape;
    }

    public void setScape(int scape) {
        this.scape = scape;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    @Override
    public int compareTo(Object compareFlower) {
        int compareFreshness = ((Flower)compareFlower).getFreshness();
        return this.getFreshness()- compareFreshness;
    }
}
