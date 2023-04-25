package org.design.pattern.duck.behavior;

/**
 * @author abouf.fofana.ext at 19/04/2023
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly !");
    }
}
