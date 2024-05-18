public class PetHospital {
    public void helpForCat(Animal animal) {
        System.out.println("Сейчас будут прочитана инструкции");
        animal.readInstruction();
        System.out.println("Сейчас оказывается помощь " + animal.getClass());
        animal.born();
        animal.setAge(0);
    }



    }

