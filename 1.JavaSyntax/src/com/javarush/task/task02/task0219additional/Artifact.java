package com.javarush.task.task02.task0219additional;

public class Artifact {
    String art;
    String cult;
    int cent;

    static int number = 212121;

    public Artifact() {
        number++;
        this.art = "Артифакт " + number;
    }

    public Artifact(String cult) {
        number++;
        this.art = "Артифакт " + number;
        this.cult = cult;
    }

    public Artifact(String cult, int cent) {
        number++;
        this.art = "Артифакт " + number;
        this.cult = cult;
        this.cent = cent;
    }

    public static void main(String[] args) {
        Artifact lamp = new Artifact();
        System.out.println(lamp.art);
        Artifact bone = new Artifact("Aztec");
        System.out.println(bone.art);
        Artifact gun = new Artifact("Greek", 19);
        System.out.println(gun.art);
    }
}
