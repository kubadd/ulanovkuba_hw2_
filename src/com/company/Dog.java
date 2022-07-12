package com.company;

public class Dog extends Animal{
    private  String thisDog = " этф собака любит спать";

    public Dog(String name, int age) {
        super(name, age);

    }

    @Override
    public void print() {
        peculiarity = " у " + getName() + "черная голова ";
        System.out.println("Зовут собаку " + getName() + "\n возраст собаки " + getAge() + " лет" + peculiarity +
                "\n"+ thisDog + "\n" + "-----------------------------------------------------------------");

    }
}
