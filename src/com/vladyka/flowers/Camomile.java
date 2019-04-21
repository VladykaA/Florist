package com.vladyka.flowers;

import com.vladyka.abstractFlower.Flower;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Camomile extends Flower {
    public Camomile() {
        super("Camomile", BigDecimal.valueOf(15.00).setScale(2,
                RoundingMode.HALF_EVEN), 5, 1);
    }
}
