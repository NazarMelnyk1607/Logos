package com.logos.Lesson_5_HomeWork;

public class BattleTwoWarriors{
    public static void fight(Warrior warrior_1, Warrior warrior_2) {
        if ((warrior_1.getHp() > 0) && (warrior_2.getHp() > 0)) {
            do {
                Attack.attackEachOther(warrior_1, warrior_2);
                if (warrior_1.getHp() <= 0) {
                    System.out.println(warrior_1.getName() + " помер");
                    System.out.println("Битва завершена, переміг воїн: " + warrior_2.getName());
                    System.out.println(warrior_2.toString());
                    break;
                }

                Attack.attackEachOther(warrior_2, warrior_1);
                if (warrior_2.getHp() <= 0) {
                    System.out.println(warrior_2.getName() + " помер");
                    System.out.println("Битва завершена, переміг воїн: " + warrior_1.getName());
                    System.out.println(warrior_1.toString());
                    break;
                }
            } while (true);
        } else if ((warrior_1.getHp() > 0) && (warrior_2.getHp() <= 0)) {
            System.out.println("Битви не буде, адже воїн " + warrior_2.getName() + " мертвий.");
        } else if ((warrior_1.getHp() <= 0) && (warrior_2.getHp() > 0)) {
            System.out.println("Битви не буде, адже воїн " + warrior_1.getName() + " мертвий.");
        }else{
            System.out.println("Обоє воїнів є мертвими.");
        }
    }

}
