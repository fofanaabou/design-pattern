package org.design.pattern;

/**
 * @author abouf.fofana.ext at 19/04/2023
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
