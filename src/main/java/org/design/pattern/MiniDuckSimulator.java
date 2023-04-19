package org.design.pattern;

/**
 * Hello world!
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        System.out.println("Hello World!");
    }
}
