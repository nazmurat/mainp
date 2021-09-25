package com.company;

public abstract class Character {
    private WeaponBehavior weaponBehavior;

    public abstract void fight();

    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }


    public void performWeapon() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}