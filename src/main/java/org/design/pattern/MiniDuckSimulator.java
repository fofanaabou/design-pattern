package org.design.pattern;

import org.design.pattern.duck.Duck;
import org.design.pattern.duck.MallardDuck;
import org.design.pattern.duck.ModelDuck;

/**
 * Hello world!
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
