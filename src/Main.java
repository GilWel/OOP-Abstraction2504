public class Main {
    public static void main(String[] args) {

        PetHospital petHospital = new PetHospital();
        Cat cat = new Cat("Белая", "сибирская");

        petHospital.helpForCat(cat);
        Dog dog = new Dog ();
        petHospital.helpForCat(dog);
        Pig pig = new Pig();
        petHospital.helpForCat(pig);

    }
}





