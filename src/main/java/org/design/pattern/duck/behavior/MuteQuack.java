package org.design.pattern.duck.behavior;

/**
 * @author abouf.fofana.ext at 19/04/2023
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
