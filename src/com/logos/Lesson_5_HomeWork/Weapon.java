package com.logos.Lesson_5_HomeWork;

public class Weapon {
    private String nameWeapon;
    private int damage;

    public Weapon(String nameWeapon, int damage) {
        this.nameWeapon = nameWeapon;
        this.damage = damage;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "nameWeapon='" + nameWeapon + '\'' +
                ", damage=" + damage +
                '}';
    }
}
