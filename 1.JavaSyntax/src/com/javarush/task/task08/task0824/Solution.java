package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public Solution() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Human ch1 = new Human("ch1", true, 12);
        Human ch2 = new Human("ch2", false, 9);
        Human ch3 = new Human("ch3", true,5);
        ArrayList<Human> chld1 = new ArrayList<>();
        chld1.add(ch1);
        chld1.add(ch2);
        chld1.add(ch3);

        Human pap1 = new Human("pap1", true, 34, chld1);
        Human mam1 = new Human("mom1", false, 29, chld1);
        ArrayList<Human> chld2 = new ArrayList<>();
        chld2.add(pap1);
        ArrayList<Human> chld3 = new ArrayList<>();
        chld3.add(mam1);

        Human ded1 = new Human("deda1",true, 67, chld2);
        Human bab1 = new Human("bab1", false,  65, chld2);

        Human ded2 = new Human("deda2",true, 71, chld3);
        Human bab2 = new Human("bab2", false,  69, chld3);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(pap1);
        System.out.println(mam1);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }

    public static class Human {
        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
