package com.logos.Lesson_5_HomeWork;

public class BattleThreeWarriors {
    public static void fight(Warrior warrior_1, Warrior warrior_2, Warrior warrior_3){
        if((warrior_1.getHp() > 0) && (warrior_2.getHp() > 0) && (warrior_3.getHp() > 0)){
            do {
                Attack.attackEachOther(warrior_1, warrior_2);
                if (warrior_1.getHp() <= 0) {
                    System.out.println(warrior_1.getName() + " помер");
                    BattleTwoWarriors.fight(warrior_2, warrior_3);
                    break;
                }

                Attack.attackEachOther(warrior_3, warrior_1);
                if (warrior_3.getHp() <= 0) {
                    System.out.println(warrior_3.getName() + " помер");
                    BattleTwoWarriors.fight(warrior_1, warrior_2);
                    break;
                }

                Attack.attackEachOther(warrior_2, warrior_3);
                if (warrior_2.getHp() <= 0) {
                    System.out.println(warrior_2.getName() + " помер");
                    BattleTwoWarriors.fight(warrior_3, warrior_1);
                    break;
                }

                Attack.attackEachOther(warrior_3, warrior_2);
                if (warrior_3.getHp() <= 0) {
                    System.out.println(warrior_3.getName() + " помер");
                    BattleTwoWarriors.fight(warrior_1, warrior_2);
                    break;
                }
            }while (true);
        }
    }
}
