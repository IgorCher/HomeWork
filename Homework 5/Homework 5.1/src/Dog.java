import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal{
    private String type = "Собака";

    Dog(String name, int age){
        super(name, age);
        setType(type);
    }

    @Override
    public String makeNoise() {
        return "Гав";
    }
}
