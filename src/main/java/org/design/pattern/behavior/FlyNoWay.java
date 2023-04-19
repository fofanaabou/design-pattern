package org.design.pattern.behavior;

import org.design.pattern.behavior.FlyBehavior;

/**
 * @author abouf.fofana.ext at 19/04/2023
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly !");
    }
}
