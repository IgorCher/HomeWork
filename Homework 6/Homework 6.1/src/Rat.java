public class Rat extends Animal{

    private String type = "Крыса";
    Rat(String name, int age){
        super(name, age);
        setType(type);
    }

    @Override
    public String makeNoise() {
        return "Псссс";
    }
}