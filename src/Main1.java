public class Main1 {
    public static void main(String[] args) {
        Swimmable a = new Dog();
        Swimmable b = new Pig();


        Pool pool = new Pool();
        pool.goSwimming(a);
        pool.goSwimming(b);

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat(int countOfeat) {

            }
        };
    }
}