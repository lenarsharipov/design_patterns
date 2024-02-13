package com.java.design_patterns.chapter01.strategy.model.impl;

import com.java.design_patterns.chapter01.strategy.behavior.impl.FlyNoWay;
import com.java.design_patterns.chapter01.strategy.behavior.impl.Quack;
import com.java.design_patterns.chapter01.strategy.model.Duck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
