package com.company;

public abstract class Animal implements Printable {

    protected static String peculiarity ;
    private  String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal(){

    }

    public static String getPecularity() {
        return peculiarity ;
    }

    public static void setPecularity(String pecularity) {
        Animal.peculiarity  = pecularity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
