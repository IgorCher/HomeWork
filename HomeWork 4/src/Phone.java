import java.sql.SQLOutput;

public class Phone {
    private String number = "default number";
    private String model = "default model";
    private int weight = 0;
    public String getNumber(){
        return number;
    }
    public String getModel(){
        return model;
    }
    public int getWeight(){
        return weight;
    }
    public Phone (String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }
    public Phone (String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){

    }
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }
    public void receiveCall (String name, String number){
        System.out.println("Звонит " + name + "\nНомер телефона: " + number);
    }
    public String toString(){
        return "number = " + number + ", model = " + model + ", weight = " + weight;
    }
    public void sendMessage(String ...numbers){
        System.out.println("Сообщение будет отправлено на номера:");
        for(String n: numbers) {
            System.out.println(n);
        }
    }
}
