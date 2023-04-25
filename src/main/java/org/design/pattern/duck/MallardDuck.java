package org.design.pattern.duck;

import org.design.pattern.duck.behavior.FlyWithWings;
import org.design.pattern.duck.behavior.Quack;

/**
 * @author abouf.fofana.ext at 19/04/2023
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
