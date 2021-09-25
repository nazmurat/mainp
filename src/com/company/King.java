package com.company;

public class King extends Character {

    public King() {
        super(new SwordBehavior());
    }

    @Override
    public void fight() {
        System.out.println("King is fighting");
    }
}
