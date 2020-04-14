package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human person1 = new Human("Mike", true, 34);
        Human person2 = new Human("Dan", true, 35);
        Human person3 = new Human("Ann", false, 33);
        Human person4 = new Human("Kate", false, 32);
        Human person5 = new Human("Jorge", true, 4, person3, person2);
        Human person6 = new Human("Sarah", false, 6, person3, person2);
        Human person7 = new Human("John", true, 10, person4, person1);
        Human person8 = new Human("Mellisa", true, 2, person4, person1);
        Human person9 = new Human("Barbara", true, 7, person4, person2);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);
        System.out.println(person7);
        System.out.println(person8);
        System.out.println(person9);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}