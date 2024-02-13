package com.java.design_patterns.chapter01.strategy.behavior.impl;

import com.java.design_patterns.chapter01.strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with rocket");
    }
}
