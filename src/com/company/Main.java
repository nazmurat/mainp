package com.company;

public class Main {

    public static void main (String[] args) {
        Character character = new King();
        character.fight();
        character.performWeapon();
        character.setWeaponBehavior(new AxeBehavior());
        character.performWeapon();
    }
}

