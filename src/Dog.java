public class Dog extends Animal {
    int pals;

    public Dog(String name, int age, int pals) {
        super(name, age);
        this.pals = pals;
    }

    public void talk() {
        System.out.println("dog bark");
    }

    public void walk() {
        int MIN_PALS_TO_WALK = 2;
        if (this.pals > MIN_PALS_TO_WALK) {
            System.out.println("dog walk");
        }
    }

}
