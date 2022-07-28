package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("male");
        wolf.setName("Белый клык");
        wolf.setWeight(5.5);
        wolf.setAge(3);
        wolf.setColor("Белый");

        System.out.println("Волка зовут " + wolf.getName());
        System.out.println("Вес волка составляет " + wolf.getWeight() + " кг");
        System.out.println("Возраст волка " + wolf.getAge() + " года");
        System.out.println("Окрас " + wolf.getColor());

        System.out.print(wolf.getName() + " ");
        wolf.hawl();
        System.out.print(wolf.getName() + " ");
        wolf.hunt();
    }
}