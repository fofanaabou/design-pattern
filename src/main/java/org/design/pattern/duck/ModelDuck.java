package org.design.pattern.duck;

import org.design.pattern.FlyNoWay;
import org.design.pattern.Quack;
import org.design.pattern.duck.Duck;

/**
 * @author abouf.fofana.ext at 19/04/2023
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
