public class Hospital {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Барсик", 2);
        animals[1] = new Dog("Мухтар", 5);
        animals[2] = new Rat("Литл", 1);

        for(Animal animal: animals){
            System.out.println(animal.getType()+" по имени "+animal.getName()+
                    " возрастом "+animal.getAge()+" издает звук: "+animal.makeNoise());
        }
    }
}