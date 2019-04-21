package com.vladyka.flowers;

import com.vladyka.abstractFlower.Flower;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tulip extends Flower {
    public Tulip() {
        super("Tulip", BigDecimal.valueOf(31.21).setScale(2, RoundingMode.HALF_EVEN),
                10, 5);
    }
}
