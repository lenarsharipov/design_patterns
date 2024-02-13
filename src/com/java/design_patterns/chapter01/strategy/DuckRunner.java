package com.java.design_patterns.chapter01.strategy;

import com.java.design_patterns.chapter01.strategy.behavior.impl.FlyRocketPowered;
import com.java.design_patterns.chapter01.strategy.model.Duck;
import com.java.design_patterns.chapter01.strategy.model.impl.MallardDuck;
import com.java.design_patterns.chapter01.strategy.model.impl.ModelDuck;

public class DuckRunner {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
        mallard.display();

        System.out.println("*".repeat(50));

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}