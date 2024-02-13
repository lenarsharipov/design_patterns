package com.java.design_patterns.chapter01.strategy.model;

import com.java.design_patterns.chapter01.strategy.behavior.FlyBehavior;
import com.java.design_patterns.chapter01.strategy.behavior.QuackBehavior;

public abstract class Duck {
    public QuackBehavior quackBehavior;
    public FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

}
