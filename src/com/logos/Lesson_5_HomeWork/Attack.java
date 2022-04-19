package com.logos.Lesson_5_HomeWork;

public class Attack {
    public static void attackEachOther(Warrior warrior_1, Warrior warrior_2){
        System.out.println("Воїн " + warrior_2.getName() + " атакує воїна " + warrior_1.getName());
        warrior_1.setHp(warrior_1.getHp() - warrior_2.getWeapon().getDamage());
        System.out.println(warrior_1.toString());
        System.out.println();
    }
}
