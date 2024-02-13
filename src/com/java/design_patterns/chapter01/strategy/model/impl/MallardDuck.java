package com.java.design_patterns.chapter01.strategy.model.impl;

import com.java.design_patterns.chapter01.strategy.behavior.impl.FlyWithWings;
import com.java.design_patterns.chapter01.strategy.behavior.impl.Quack;
import com.java.design_patterns.chapter01.strategy.model.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am real Mallard duck");
    }
}
