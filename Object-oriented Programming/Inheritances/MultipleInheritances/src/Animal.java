public class Animal implements AnimalTravel, AnimalEat {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void travel() {
        System.out.println("Animal is traveling");
    }
}
