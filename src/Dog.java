import java.util.Random;

public class Dog extends Animal implements Swimmable, AbleToEat{

    private int numberOfKnownCommands;

    public Dog(String name, String type, int age, int numberOfKnownCommands) {
        this.setName(name);;
        this.setType(type);
        this.setAge(age);
        this.numberOfKnownCommands = numberOfKnownCommands;
    }

    public Dog() {

    }

    public int getNumberOfKnownCommands() {
        return numberOfKnownCommands;
    }

    public void setNumberOfKnownCommands(int numberOfKnownCommands) {
        this.numberOfKnownCommands = numberOfKnownCommands;
    }

    @Override
    void born() {
        System.out.println("Я собачка, я родилась!!!");
    }

    @Override
    void readInstruction() {
        System.out.println("1. Говорите успокаивающим голосом");
        System.out.println("2. Не бесите собаку");
    }

    @Override
    public void swim() {
        System.out.println("Левой, правой");
        System.out.println("о поплыла");
    }

    @Override
    public void eat(int countOfeat) {
        System.out.println("с удовольствием было съедено");
    }
}