package com.company;

public class Knight extends Character {

    public Knight() {
        super(new KnifeBehavior());
    }

    @Override
    public void fight() {
        System.out.println("Knight is fighting");
    }
}