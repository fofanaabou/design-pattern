package org.design.pattern.duck.behavior;

/**
 * @author abouf.fofana.ext at 19/04/2023
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
