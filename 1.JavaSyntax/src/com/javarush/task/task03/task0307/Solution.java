package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    int nubmer = 0;
    String zergName = "zerg";

    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg[] zerg = new Zerg[10];
        for (int z = 0; z < 5; z++) {
            zerg[z] = new Zerg();
            zerg[z].name = "nameZ" + z;
        }

        Protoss[] protoss = new Protoss[10];
        for (int p = 0; p < 3; p++) {
            protoss[p] = new Protoss();
            protoss[p].name = "nameP" + p;
        }

        Terran[] terran = new Terran[10];
        for (int t = 0; t < 4; t++) {
            terran[t] = new Terran();
            terran[t].name = "nameT" + t;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
