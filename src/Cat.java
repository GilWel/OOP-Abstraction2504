

import java.util.Random;

public class Cat extends Animal implements AbleToEat {
    // все поля ВСЕГДА private
    //методы:
    //Если вы хотите дать доступ к этому методу классам снаружи - public
    //Если не хотите, то private

    private static final int MAX_LIVES = 9;
    private int livesWasted;

    public Cat(String name, String type, int age) {
        // две строки сверху можно заменить на this(name,type);
        this.setName(name);
        this.setType(type);
        this.setAge(age);


    }

    public Cat(String name, String type) {
        this.setName(name);
        this.setType(type);

    }

    public Cat() {
        setType("ohne Type");
    }

    private void die() {
        livesWasted++;
        System.out.println("Кот умер");

    }

    //геттеры = специальные методы, которые позволяют получить доступ к просмотру какого-либо поля
    public boolean jump() {
        if (livesWasted == MAX_LIVES) {
            System.out.println("Извините, но кошка больше не может прыгать");
            return false;
        }
        Random random = new Random();
        int number = random.nextInt(100);

        if (number == 0) {
            die();
        } else {
            System.out.println("Вау, как круто летим");
        }

        return true;
    }

    @Override
    void born() {
        System.out.println("Я кошечка, я родилась");
        System.out.println("меня зовут Мурка");
    }
    void readInstruction() {
        System.out.println("1. Уложите на бочок ");
        System.out.println("Погладьте животик");

    }

    @Override
    public void eat(int countOfeat) {
        System.out.println("Быстренько все съедено");
    }
}

