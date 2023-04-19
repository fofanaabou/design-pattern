package org.design.pattern;

/**
 * @author Abou FOFANA at 19/04/2023
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All duck float, even decoy!");
    }
}
