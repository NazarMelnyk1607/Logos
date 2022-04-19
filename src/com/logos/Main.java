package com.logos;

import com.logos.Lesson_5_HomeWork.BattleThreeWarriors;
import com.logos.Lesson_5_HomeWork.BattleTwoWarriors;
import com.logos.Lesson_5_HomeWork.Warrior;
import com.logos.Lesson_5_HomeWork.Weapon;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Weapon weapon_1 = new Weapon("Пістолет", 300);
        Weapon weapon_2 = new Weapon("Ніж", 200);
        Weapon weapon_3 = new Weapon("Арбалет", 350);

        Warrior warrior_1 = new Warrior("Воїн №1", 800, weapon_1);
        Warrior warrior_2 = new Warrior("Воїн №2", 1000, weapon_2);
        Warrior warrior_3 = new Warrior("Воїн №3", 900, weapon_3);

        ArrayList <Warrior> warriors = new ArrayList<>();

        warriors.add(warrior_1);
        warriors.add(warrior_2);
        warriors.add(warrior_3);

        if(warriors.size() == 2){
            System.out.println("Було знайдено - " + warriors.size() + " воїнів.");
            System.out.println();
            for (int i = 0; i < warriors.size(); i++) {
                System.out.println(warriors.get(i).toString());
            }
            System.out.println();
            System.out.println("Битва почалася!!!");
            BattleTwoWarriors.fight(warriors.get(0), warriors.get(1));
        }else if(warriors.size() == 3){
            System.out.println("Було знайдено - " + warriors.size() + " воїнів.");
            System.out.println();
            for (int i = 0; i < warriors.size(); i++) {
                System.out.println(warriors.get(i).toString());
            }
            System.out.println();
            System.out.println("Битва почалася!!!");
            BattleThreeWarriors.fight(warriors.get(0), warriors.get(1), warriors.get(2));
        }else{
            System.out.println("Некоректна кількість воїнів.");
        }

    }
}
