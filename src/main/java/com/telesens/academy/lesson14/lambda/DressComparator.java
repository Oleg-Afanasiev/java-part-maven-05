package com.telesens.academy.lesson14.lambda;

import com.telesens.academy.automationpractice.model.EntityDress;

import java.util.Comparator;

public class DressComparator implements Comparator<EntityDress> {
    @Override
    public int compare(EntityDress dress1, EntityDress dress2) {
        return Double.compare(dress1.getPrice(), dress2.getPrice());
    }
}
