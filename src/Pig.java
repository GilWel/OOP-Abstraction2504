public class Pig extends Animal implements Swimmable, AbleToEat{
    @Override
    void born() {
        System.out.println("Я свинка счастлива, что родилась");

    }

    @Override
    void readInstruction() {
        System.out.println("Не трогайте ее, она сама");

    }

    @Override
    public void swim() {
        System.out.println("еле - еле, но поплыла");
    }

    @Override
    public void eat(int countOfeat) {
        System.out.println("Проворно все съедено");
    }
}
