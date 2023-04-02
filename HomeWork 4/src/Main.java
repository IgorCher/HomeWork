public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("+375333121212","Iphone",1);
        Phone p2 = new Phone("+375293122323","Samsung");
        Phone p3 = new Phone();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println();
        p1.receiveCall("Bill");
        p1.receiveCall("Jack");
        p1.receiveCall("Patric");
        System.out.println();
        p1.receiveCall("Boris", p1.getNumber());
        System.out.println();
        p1.sendMessage(p1.getNumber(), p2.getNumber(), p3.getNumber());
    }
}