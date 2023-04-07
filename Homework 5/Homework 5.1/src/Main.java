public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Барсик", 2),
                            new Dog("Мухтар", 6),
                            new Rat("Литл",1)};
        for (Animal animal: animals){
            System.out.println(animal.getType() + " по имени " + animal.getName()+ " возрастом " + animal.getAge()+ " издает звук: " + animal.makeNoise());
        }

    }
}