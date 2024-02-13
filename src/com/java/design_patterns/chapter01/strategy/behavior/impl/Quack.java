package com.java.design_patterns.chapter01.strategy.behavior.impl;

import com.java.design_patterns.chapter01.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
