package org.design.pattern.behavior;

import org.design.pattern.behavior.FlyBehavior;

/**
 * @author abouf.fofana.ext at 19/04/2023
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
