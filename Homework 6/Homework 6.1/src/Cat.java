public class Cat extends Animal{
    private String type = "Кот";
    Cat(String name, int age){
        super(name, age);
        setType(type);
    }

    @Override
    public String makeNoise() {
        return "Мяу";
    }
}
