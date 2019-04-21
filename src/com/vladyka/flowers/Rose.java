package com.vladyka.flowers;
import com.vladyka.abstractFlower.Flower;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rose extends Flower{
    public Rose() {
        super("Red Rose", BigDecimal.valueOf(50.22).setScale(2,
                        RoundingMode.HALF_EVEN), 20, 2);
    }

}
